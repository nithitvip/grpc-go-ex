package main

import (
	"context"
	"github.com/grpc-ecosystem/grpc-gateway/v2/runtime"
	"google.golang.org/grpc"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/credentials/insecure"
	"google.golang.org/grpc/metadata"
	"google.golang.org/grpc/status"
	"log"
	"net/http"
	"os"

	pb "bitbucket.com/mightnvi/grpc-go-ex/gateway/proto/greet/v1"
)

func main() {
	serverURI := getEnv("SERVER_URI", "localhost:50051")

	option := []grpc.DialOption{
		grpc.WithBlock(),
		grpc.WithTransportCredentials(insecure.NewCredentials()),
		grpc.WithUnaryInterceptor(UnaryClientInterceptor()),
	}

	gwmux := runtime.NewServeMux()

	// Register Greeter
	err := pb.RegisterGreetServiceHandlerFromEndpoint(context.Background(), gwmux, serverURI, option)
	if err != nil {
		log.Fatalln("Failed to register gateway:", err)
	}

	mux := http.NewServeMux()
	mux.Handle("/", gwmux)

	mux.HandleFunc("/swagger.json", func(writer http.ResponseWriter, request *http.Request) {
		http.ServeFile(writer, request, "openapiv2/greet/v1/greet_gw.swagger.json")
	})
	fs := http.FileServer(http.Dir("dist"))
	mux.Handle("/swagger-ui/", http.StripPrefix("/swagger-ui", fs))

	gwServer := &http.Server{
		Addr:    ":8090",
		Handler: mux,
	}

	log.Println("Serving gRPC-Gateway on http://0.0.0.0:8090")
	log.Fatalln(gwServer.ListenAndServe())

}

func getEnv(key, fallback string) string {
	if value, ok := os.LookupEnv(key); ok {
		return value
	}
	return fallback
}

func UnaryClientInterceptor() grpc.UnaryClientInterceptor {
	return func(ctx context.Context, method string, req, reply interface{}, cc *grpc.ClientConn, invoker grpc.UnaryInvoker, opts ...grpc.CallOption) error {
		md, ok := metadata.FromOutgoingContext(ctx)
		if !ok {
			return status.Errorf(codes.InvalidArgument, "Retrieving metadata is failed")
		}

		authHeader, ok := md["authorization"]
		if !ok {
			return status.Errorf(codes.Unauthenticated, "Authorization token is not supplied")
		}
		log.Println(authHeader)
		log.Println(method, req, reply)
		err := invoker(ctx, method, req, reply, cc, opts...)
		log.Println("after")
		return err
	}
}
