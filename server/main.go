package main

import (
	"context"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/reflection"
	"google.golang.org/grpc/status"
	"google.golang.org/protobuf/types/known/timestamppb"
	"io"
	"log"
	"net"
	"time"

	pb "bitbucket.com/mightnvi/grpc-go-ex/server/proto/greet/v1"
)

type Server struct {
	pb.UnimplementedGreetServiceServer
}

func main() {
	lis, err := net.Listen("tcp", ":50051")
	if err != nil {
		log.Fatalf("Failed to listen: %v\n", err)
	}
	defer lis.Close()

	server := &Server{}
	s := grpc.NewServer()
	pb.RegisterGreetServiceServer(s, server)

	//for server reflection
	reflection.Register(s)

	if err := s.Serve(lis); err != nil {
		log.Fatalf("Failed to serve: %v\n", err)
	}

}

func (s *Server) GreetUnary(ctx context.Context, in *pb.GreetRequest) (*pb.GreetResponse, error) {
	log.Println(in)
	if in.Name == "" {
		return nil, status.Error(codes.InvalidArgument, "message is required")
	}

	length := int32(len(in.Name))
	return &pb.GreetResponse{
		Message:     "Hello " + in.Name,
		CharLength:  &length,
		CurrentTime: timestamppb.New(time.Now()),
	}, nil
}

func (s *Server) GreetClientStream(stream pb.GreetService_GreetClientStreamServer) error {
	var name = ""
	for {
		req, err := stream.Recv()
		log.Println(req)
		if err == io.EOF {
			return stream.SendAndClose(&pb.GreetResponse{
				Message:     "Hello " + name,
				CurrentTime: timestamppb.New(time.Now()),
			})
		}
		if err != nil {
			return err
		}

		name += req.Name
	}
}

func (s *Server) GreetServiceStream(in *pb.GreetRequest, stream pb.GreetService_GreetServiceStreamServer) error {
	log.Println(in)
	if in.Name == "" {
		return status.Error(codes.InvalidArgument, "message is required")
	}

	data := []string{"this", "is", "looooooong", "message"}

	for _, d := range data {
		err := stream.Send(&pb.GreetResponse{
			Message:     d,
			CurrentTime: timestamppb.New(time.Now()),
		})
		if err != nil {
			return err
		}
	}

	return nil
}

func (s *Server) GreetBidirectional(stream pb.GreetService_GreetBidirectionalServer) error {
	for {
		req, err := stream.Recv()
		if err == io.EOF {
			return nil
		}
		if err != nil {
			return err
		}

		err = stream.Send(&pb.GreetResponse{
			Message:     "Hello " + req.Name,
			CurrentTime: timestamppb.New(time.Now()),
		})
		if err != nil {
			return err
		}
	}
}
