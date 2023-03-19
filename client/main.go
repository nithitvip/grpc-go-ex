package main

import (
	"context"
	"google.golang.org/grpc"
	"google.golang.org/grpc/credentials/insecure"
	"log"

	pb "bitbucket.com/mightnvi/grpc-go-ex/client/proto/greet/v1"
)

func main() {
	conn, err := grpc.Dial("localhost:50051", grpc.WithTransportCredentials(insecure.NewCredentials()))

	if err != nil {
		log.Fatalf("Did not connect: %v\n", err)
	}

	defer conn.Close()
	c := pb.NewGreetServiceClient(conn)

	sendUnary("test", c)
	sendUnary("", c)

}

func sendUnary(name string, client pb.GreetServiceClient) {
	res, err := client.GreetUnary(context.Background(), &pb.GreetRequest{
		Name: name,
	})
	if err != nil {
		log.Println(err)
	}
	log.Println(res)
}
