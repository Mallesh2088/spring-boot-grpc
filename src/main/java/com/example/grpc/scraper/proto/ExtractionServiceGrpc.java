package com.example.grpc.scraper.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: extraction_service.proto")
public final class ExtractionServiceGrpc {

  private ExtractionServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.scraper.proto.ExtractionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ExtractionRequest,
      ExtractionResponse> getExtractOrgJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "extractOrgJobs",
      requestType = ExtractionRequest.class,
      responseType = ExtractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ExtractionRequest,
      ExtractionResponse> getExtractOrgJobsMethod() {
    io.grpc.MethodDescriptor<ExtractionRequest, ExtractionResponse> getExtractOrgJobsMethod;
    if ((getExtractOrgJobsMethod = ExtractionServiceGrpc.getExtractOrgJobsMethod) == null) {
      synchronized (ExtractionServiceGrpc.class) {
        if ((getExtractOrgJobsMethod = ExtractionServiceGrpc.getExtractOrgJobsMethod) == null) {
          ExtractionServiceGrpc.getExtractOrgJobsMethod = getExtractOrgJobsMethod =
              io.grpc.MethodDescriptor.<ExtractionRequest, ExtractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "extractOrgJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ExtractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ExtractionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExtractionServiceMethodDescriptorSupplier("extractOrgJobs"))
              .build();
        }
      }
    }
    return getExtractOrgJobsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExtractionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtractionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtractionServiceStub>() {
        @Override
        public ExtractionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtractionServiceStub(channel, callOptions);
        }
      };
    return ExtractionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExtractionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtractionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtractionServiceBlockingStub>() {
        @Override
        public ExtractionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtractionServiceBlockingStub(channel, callOptions);
        }
      };
    return ExtractionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExtractionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExtractionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExtractionServiceFutureStub>() {
        @Override
        public ExtractionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExtractionServiceFutureStub(channel, callOptions);
        }
      };
    return ExtractionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ExtractionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void extractOrgJobs(ExtractionRequest request,
                               io.grpc.stub.StreamObserver<ExtractionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExtractOrgJobsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExtractOrgJobsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                ExtractionRequest,
                ExtractionResponse>(
                  this, METHODID_EXTRACT_ORG_JOBS)))
          .build();
    }
  }

  /**
   */
  public static final class ExtractionServiceStub extends io.grpc.stub.AbstractAsyncStub<ExtractionServiceStub> {
    private ExtractionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ExtractionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtractionServiceStub(channel, callOptions);
    }

    /**
     */
    public void extractOrgJobs(ExtractionRequest request,
                               io.grpc.stub.StreamObserver<ExtractionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getExtractOrgJobsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExtractionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExtractionServiceBlockingStub> {
    private ExtractionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ExtractionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtractionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ExtractionResponse> extractOrgJobs(
        ExtractionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getExtractOrgJobsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExtractionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExtractionServiceFutureStub> {
    private ExtractionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ExtractionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExtractionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EXTRACT_ORG_JOBS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExtractionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExtractionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXTRACT_ORG_JOBS:
          serviceImpl.extractOrgJobs((ExtractionRequest) request,
              (io.grpc.stub.StreamObserver<ExtractionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ExtractionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExtractionServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ExtractionServiceOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExtractionService");
    }
  }

  private static final class ExtractionServiceFileDescriptorSupplier
      extends ExtractionServiceBaseDescriptorSupplier {
    ExtractionServiceFileDescriptorSupplier() {}
  }

  private static final class ExtractionServiceMethodDescriptorSupplier
      extends ExtractionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExtractionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExtractionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExtractionServiceFileDescriptorSupplier())
              .addMethod(getExtractOrgJobsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
