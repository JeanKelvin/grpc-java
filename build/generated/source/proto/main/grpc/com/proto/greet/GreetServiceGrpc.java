package com.proto.greet;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: greet/greet.proto")
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Greet",
      requestType = com.proto.greet.GreetRequest.class,
      responseType = com.proto.greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetRequest,
      com.proto.greet.GreetResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse> getGreetMethod;
    if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
          GreetServiceGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetRequest, com.proto.greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("Greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.GreetManyTimesRequest,
      com.proto.greet.GreetManyTimesResponse> getGreetManyTimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GreetManyTimes",
      requestType = com.proto.greet.GreetManyTimesRequest.class,
      responseType = com.proto.greet.GreetManyTimesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.GreetManyTimesRequest,
      com.proto.greet.GreetManyTimesResponse> getGreetManyTimesMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.GreetManyTimesRequest, com.proto.greet.GreetManyTimesResponse> getGreetManyTimesMethod;
    if ((getGreetManyTimesMethod = GreetServiceGrpc.getGreetManyTimesMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetManyTimesMethod = GreetServiceGrpc.getGreetManyTimesMethod) == null) {
          GreetServiceGrpc.getGreetManyTimesMethod = getGreetManyTimesMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.GreetManyTimesRequest, com.proto.greet.GreetManyTimesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GreetManyTimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetManyTimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.GreetManyTimesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("GreetManyTimes"))
              .build();
        }
      }
    }
    return getGreetManyTimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.greet.LongGreetRequest,
      com.proto.greet.LongGreetResponse> getLongGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LongGreet",
      requestType = com.proto.greet.LongGreetRequest.class,
      responseType = com.proto.greet.LongGreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.greet.LongGreetRequest,
      com.proto.greet.LongGreetResponse> getLongGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.greet.LongGreetRequest, com.proto.greet.LongGreetResponse> getLongGreetMethod;
    if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
          GreetServiceGrpc.getLongGreetMethod = getLongGreetMethod =
              io.grpc.MethodDescriptor.<com.proto.greet.LongGreetRequest, com.proto.greet.LongGreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LongGreet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.LongGreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.greet.LongGreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("LongGreet"))
              .build();
        }
      }
    }
    return getLongGreetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    return new GreetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unaryn
     * </pre>
     */
    public void greet(com.proto.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming
     * </pre>
     */
    public void greetManyTimes(com.proto.greet.GreetManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetManyTimesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetManyTimesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cliente Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.proto.greet.LongGreetResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLongGreetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.greet.GreetRequest,
                com.proto.greet.GreetResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetManyTimesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.greet.GreetManyTimesRequest,
                com.proto.greet.GreetManyTimesResponse>(
                  this, METHODID_GREET_MANY_TIMES)))
          .addMethod(
            getLongGreetMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.greet.LongGreetRequest,
                com.proto.greet.LongGreetResponse>(
                  this, METHODID_LONG_GREET)))
          .build();
    }
  }

  /**
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractStub<GreetServiceStub> {
    private GreetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unaryn
     * </pre>
     */
    public void greet(com.proto.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming
     * </pre>
     */
    public void greetManyTimes(com.proto.greet.GreetManyTimesRequest request,
        io.grpc.stub.StreamObserver<com.proto.greet.GreetManyTimesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGreetManyTimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cliente Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.greet.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.proto.greet.LongGreetResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLongGreetMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unaryn
     * </pre>
     */
    public com.proto.greet.GreetResponse greet(com.proto.greet.GreetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming
     * </pre>
     */
    public java.util.Iterator<com.proto.greet.GreetManyTimesResponse> greetManyTimes(
        com.proto.greet.GreetManyTimesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGreetManyTimesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unaryn
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.greet.GreetResponse> greet(
        com.proto.greet.GreetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_MANY_TIMES = 1;
  private static final int METHODID_LONG_GREET = 2;

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
        case METHODID_GREET:
          serviceImpl.greet((com.proto.greet.GreetRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetResponse>) responseObserver);
          break;
        case METHODID_GREET_MANY_TIMES:
          serviceImpl.greetManyTimes((com.proto.greet.GreetManyTimesRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.greet.GreetManyTimesResponse>) responseObserver);
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
        case METHODID_LONG_GREET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.longGreet(
              (io.grpc.stub.StreamObserver<com.proto.greet.LongGreetResponse>) responseObserver);
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
      return com.proto.greet.Greet.getDescriptor();
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
              .addMethod(getGreetMethod())
              .addMethod(getGreetManyTimesMethod())
              .addMethod(getLongGreetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
