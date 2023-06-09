// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.3.0
// - protoc             (unknown)
// source: greet/v1/greet.proto

package proto

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

const (
	GreetService_GreetUnary_FullMethodName         = "/greet.v1.GreetService/GreetUnary"
	GreetService_GreetClientStream_FullMethodName  = "/greet.v1.GreetService/GreetClientStream"
	GreetService_GreetServiceStream_FullMethodName = "/greet.v1.GreetService/GreetServiceStream"
	GreetService_GreetBidirectional_FullMethodName = "/greet.v1.GreetService/GreetBidirectional"
)

// GreetServiceClient is the client API for GreetService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type GreetServiceClient interface {
	GreetUnary(ctx context.Context, in *GreetRequest, opts ...grpc.CallOption) (*GreetResponse, error)
	GreetClientStream(ctx context.Context, opts ...grpc.CallOption) (GreetService_GreetClientStreamClient, error)
	GreetServiceStream(ctx context.Context, in *GreetRequest, opts ...grpc.CallOption) (GreetService_GreetServiceStreamClient, error)
	GreetBidirectional(ctx context.Context, opts ...grpc.CallOption) (GreetService_GreetBidirectionalClient, error)
}

type greetServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewGreetServiceClient(cc grpc.ClientConnInterface) GreetServiceClient {
	return &greetServiceClient{cc}
}

func (c *greetServiceClient) GreetUnary(ctx context.Context, in *GreetRequest, opts ...grpc.CallOption) (*GreetResponse, error) {
	out := new(GreetResponse)
	err := c.cc.Invoke(ctx, GreetService_GreetUnary_FullMethodName, in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *greetServiceClient) GreetClientStream(ctx context.Context, opts ...grpc.CallOption) (GreetService_GreetClientStreamClient, error) {
	stream, err := c.cc.NewStream(ctx, &GreetService_ServiceDesc.Streams[0], GreetService_GreetClientStream_FullMethodName, opts...)
	if err != nil {
		return nil, err
	}
	x := &greetServiceGreetClientStreamClient{stream}
	return x, nil
}

type GreetService_GreetClientStreamClient interface {
	Send(*GreetRequest) error
	CloseAndRecv() (*GreetResponse, error)
	grpc.ClientStream
}

type greetServiceGreetClientStreamClient struct {
	grpc.ClientStream
}

func (x *greetServiceGreetClientStreamClient) Send(m *GreetRequest) error {
	return x.ClientStream.SendMsg(m)
}

func (x *greetServiceGreetClientStreamClient) CloseAndRecv() (*GreetResponse, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(GreetResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *greetServiceClient) GreetServiceStream(ctx context.Context, in *GreetRequest, opts ...grpc.CallOption) (GreetService_GreetServiceStreamClient, error) {
	stream, err := c.cc.NewStream(ctx, &GreetService_ServiceDesc.Streams[1], GreetService_GreetServiceStream_FullMethodName, opts...)
	if err != nil {
		return nil, err
	}
	x := &greetServiceGreetServiceStreamClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type GreetService_GreetServiceStreamClient interface {
	Recv() (*GreetResponse, error)
	grpc.ClientStream
}

type greetServiceGreetServiceStreamClient struct {
	grpc.ClientStream
}

func (x *greetServiceGreetServiceStreamClient) Recv() (*GreetResponse, error) {
	m := new(GreetResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *greetServiceClient) GreetBidirectional(ctx context.Context, opts ...grpc.CallOption) (GreetService_GreetBidirectionalClient, error) {
	stream, err := c.cc.NewStream(ctx, &GreetService_ServiceDesc.Streams[2], GreetService_GreetBidirectional_FullMethodName, opts...)
	if err != nil {
		return nil, err
	}
	x := &greetServiceGreetBidirectionalClient{stream}
	return x, nil
}

type GreetService_GreetBidirectionalClient interface {
	Send(*GreetRequest) error
	Recv() (*GreetResponse, error)
	grpc.ClientStream
}

type greetServiceGreetBidirectionalClient struct {
	grpc.ClientStream
}

func (x *greetServiceGreetBidirectionalClient) Send(m *GreetRequest) error {
	return x.ClientStream.SendMsg(m)
}

func (x *greetServiceGreetBidirectionalClient) Recv() (*GreetResponse, error) {
	m := new(GreetResponse)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// GreetServiceServer is the server API for GreetService service.
// All implementations must embed UnimplementedGreetServiceServer
// for forward compatibility
type GreetServiceServer interface {
	GreetUnary(context.Context, *GreetRequest) (*GreetResponse, error)
	GreetClientStream(GreetService_GreetClientStreamServer) error
	GreetServiceStream(*GreetRequest, GreetService_GreetServiceStreamServer) error
	GreetBidirectional(GreetService_GreetBidirectionalServer) error
	mustEmbedUnimplementedGreetServiceServer()
}

// UnimplementedGreetServiceServer must be embedded to have forward compatible implementations.
type UnimplementedGreetServiceServer struct {
}

func (UnimplementedGreetServiceServer) GreetUnary(context.Context, *GreetRequest) (*GreetResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GreetUnary not implemented")
}
func (UnimplementedGreetServiceServer) GreetClientStream(GreetService_GreetClientStreamServer) error {
	return status.Errorf(codes.Unimplemented, "method GreetClientStream not implemented")
}
func (UnimplementedGreetServiceServer) GreetServiceStream(*GreetRequest, GreetService_GreetServiceStreamServer) error {
	return status.Errorf(codes.Unimplemented, "method GreetServiceStream not implemented")
}
func (UnimplementedGreetServiceServer) GreetBidirectional(GreetService_GreetBidirectionalServer) error {
	return status.Errorf(codes.Unimplemented, "method GreetBidirectional not implemented")
}
func (UnimplementedGreetServiceServer) mustEmbedUnimplementedGreetServiceServer() {}

// UnsafeGreetServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to GreetServiceServer will
// result in compilation errors.
type UnsafeGreetServiceServer interface {
	mustEmbedUnimplementedGreetServiceServer()
}

func RegisterGreetServiceServer(s grpc.ServiceRegistrar, srv GreetServiceServer) {
	s.RegisterService(&GreetService_ServiceDesc, srv)
}

func _GreetService_GreetUnary_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GreetRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(GreetServiceServer).GreetUnary(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: GreetService_GreetUnary_FullMethodName,
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(GreetServiceServer).GreetUnary(ctx, req.(*GreetRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _GreetService_GreetClientStream_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(GreetServiceServer).GreetClientStream(&greetServiceGreetClientStreamServer{stream})
}

type GreetService_GreetClientStreamServer interface {
	SendAndClose(*GreetResponse) error
	Recv() (*GreetRequest, error)
	grpc.ServerStream
}

type greetServiceGreetClientStreamServer struct {
	grpc.ServerStream
}

func (x *greetServiceGreetClientStreamServer) SendAndClose(m *GreetResponse) error {
	return x.ServerStream.SendMsg(m)
}

func (x *greetServiceGreetClientStreamServer) Recv() (*GreetRequest, error) {
	m := new(GreetRequest)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _GreetService_GreetServiceStream_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(GreetRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(GreetServiceServer).GreetServiceStream(m, &greetServiceGreetServiceStreamServer{stream})
}

type GreetService_GreetServiceStreamServer interface {
	Send(*GreetResponse) error
	grpc.ServerStream
}

type greetServiceGreetServiceStreamServer struct {
	grpc.ServerStream
}

func (x *greetServiceGreetServiceStreamServer) Send(m *GreetResponse) error {
	return x.ServerStream.SendMsg(m)
}

func _GreetService_GreetBidirectional_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(GreetServiceServer).GreetBidirectional(&greetServiceGreetBidirectionalServer{stream})
}

type GreetService_GreetBidirectionalServer interface {
	Send(*GreetResponse) error
	Recv() (*GreetRequest, error)
	grpc.ServerStream
}

type greetServiceGreetBidirectionalServer struct {
	grpc.ServerStream
}

func (x *greetServiceGreetBidirectionalServer) Send(m *GreetResponse) error {
	return x.ServerStream.SendMsg(m)
}

func (x *greetServiceGreetBidirectionalServer) Recv() (*GreetRequest, error) {
	m := new(GreetRequest)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// GreetService_ServiceDesc is the grpc.ServiceDesc for GreetService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var GreetService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "greet.v1.GreetService",
	HandlerType: (*GreetServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GreetUnary",
			Handler:    _GreetService_GreetUnary_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "GreetClientStream",
			Handler:       _GreetService_GreetClientStream_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "GreetServiceStream",
			Handler:       _GreetService_GreetServiceStream_Handler,
			ServerStreams: true,
		},
		{
			StreamName:    "GreetBidirectional",
			Handler:       _GreetService_GreetBidirectional_Handler,
			ServerStreams: true,
			ClientStreams: true,
		},
	},
	Metadata: "greet/v1/greet.proto",
}
