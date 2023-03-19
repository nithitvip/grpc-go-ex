package bitbucket.com.mightnvi.grpcgoex;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: greet/v1/greet.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.v1.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
      bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetUnaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetUnary",
      requestType = bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest.class,
      responseType = bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
      bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetUnaryMethod() {
    io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest, bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetUnaryMethod;
    if ((getGreetUnaryMethod = GreetServiceGrpc.getGreetUnaryMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetUnaryMethod = GreetServiceGrpc.getGreetUnaryMethod) == null) {
          GreetServiceGrpc.getGreetUnaryMethod = getGreetUnaryMethod =
              io.grpc.MethodDescriptor.<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest, bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetUnary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetUnary"))
              .build();
        }
      }
    }
    return getGreetUnaryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
      bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetClientStream",
      requestType = bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest.class,
      responseType = bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
      bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetClientStreamMethod() {
    io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest, bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetClientStreamMethod;
    if ((getGreetClientStreamMethod = GreetServiceGrpc.getGreetClientStreamMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetClientStreamMethod = GreetServiceGrpc.getGreetClientStreamMethod) == null) {
          GreetServiceGrpc.getGreetClientStreamMethod = getGreetClientStreamMethod =
              io.grpc.MethodDescriptor.<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest, bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetClientStream"))
              .build();
        }
      }
    }
    return getGreetClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
      bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetServiceStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetServiceStream",
      requestType = bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest.class,
      responseType = bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
      bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetServiceStreamMethod() {
    io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest, bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetServiceStreamMethod;
    if ((getGreetServiceStreamMethod = GreetServiceGrpc.getGreetServiceStreamMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetServiceStreamMethod = GreetServiceGrpc.getGreetServiceStreamMethod) == null) {
          GreetServiceGrpc.getGreetServiceStreamMethod = getGreetServiceStreamMethod =
              io.grpc.MethodDescriptor.<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest, bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetServiceStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetServiceStream"))
              .build();
        }
      }
    }
    return getGreetServiceStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
      bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetBidirectionalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetBidirectional",
      requestType = bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest.class,
      responseType = bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
      bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetBidirectionalMethod() {
    io.grpc.MethodDescriptor<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest, bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> getGreetBidirectionalMethod;
    if ((getGreetBidirectionalMethod = GreetServiceGrpc.getGreetBidirectionalMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetBidirectionalMethod = GreetServiceGrpc.getGreetBidirectionalMethod) == null) {
          GreetServiceGrpc.getGreetBidirectionalMethod = getGreetBidirectionalMethod =
              io.grpc.MethodDescriptor.<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest, bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetBidirectional"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetBidirectional"))
              .build();
        }
      }
    }
    return getGreetBidirectionalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub>() {
        @java.lang.Override
        public GreetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceStub(channel, callOptions);
        }
      };
    return GreetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub>() {
        @java.lang.Override
        public GreetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub>() {
        @java.lang.Override
        public GreetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceFutureStub(channel, callOptions);
        }
      };
    return GreetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void greetUnary(bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest request,
        io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetUnaryMethod(), responseObserver);
    }

    /**
     * <pre>
     *client stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest> greetClientStream(
        io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetClientStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public void greetServiceStream(bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest request,
        io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetServiceStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidirectional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest> greetBidirectional(
        io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetBidirectionalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetUnaryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
                bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>(
                  this, METHODID_GREET_UNARY)))
          .addMethod(
            getGreetClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
                bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>(
                  this, METHODID_GREET_CLIENT_STREAM)))
          .addMethod(
            getGreetServiceStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
                bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>(
                  this, METHODID_GREET_SERVICE_STREAM)))
          .addMethod(
            getGreetBidirectionalMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest,
                bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>(
                  this, METHODID_GREET_BIDIRECTIONAL)))
          .build();
    }
  }

  /**
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetServiceStub> {
    private GreetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void greetUnary(bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest request,
        io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetUnaryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest> greetClientStream(
        io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getGreetClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public void greetServiceStream(bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest request,
        io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGreetServiceStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *bidirectional stream
     * </pre>
     */
    public io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest> greetBidirectional(
        io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetBidirectionalMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse greetUnary(bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetUnaryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server stream
     * </pre>
     */
    public java.util.Iterator<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> greetServiceStream(
        bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGreetServiceStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse> greetUnary(
        bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetUnaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET_UNARY = 0;
  private static final int METHODID_GREET_SERVICE_STREAM = 1;
  private static final int METHODID_GREET_CLIENT_STREAM = 2;
  private static final int METHODID_GREET_BIDIRECTIONAL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET_UNARY:
          serviceImpl.greetUnary((bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest) request,
              (io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>) responseObserver);
          break;
        case METHODID_GREET_SERVICE_STREAM:
          serviceImpl.greetServiceStream((bitbucket.com.mightnvi.grpcgoex.Greet.GreetRequest) request,
              (io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetClientStream(
              (io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>) responseObserver);
        case METHODID_GREET_BIDIRECTIONAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetBidirectional(
              (io.grpc.stub.StreamObserver<bitbucket.com.mightnvi.grpcgoex.Greet.GreetResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bitbucket.com.mightnvi.grpcgoex.Greet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getGreetUnaryMethod())
              .addMethod(getGreetClientStreamMethod())
              .addMethod(getGreetServiceStreamMethod())
              .addMethod(getGreetBidirectionalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
