// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: extraction_service.proto

package com.example.grpc.scraper.proto;

public final class ExtractionServiceOuterClass {
  private ExtractionServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_scraper_proto_ExtractionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_scraper_proto_ExtractionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_scraper_proto_ExtractionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_scraper_proto_ExtractionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_scraper_proto_JobDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_scraper_proto_JobDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030extraction_service.proto\022\036com.example." +
      "grpc.scraper.proto\"F\n\021ExtractionRequest\022" +
      "\r\n\005orgId\030\001 \001(\003\022\017\n\007company\030\002 \001(\t\022\021\n\tparam" +
      "Json\030\003 \001(\t\"t\n\022ExtractionResponse\022\r\n\005orgI" +
      "d\030\001 \001(\003\022\017\n\007company\030\002 \001(\t\022>\n\njobDetails\030\003" +
      " \003(\0132*.com.example.grpc.scraper.proto.Jo" +
      "bDetails\"\036\n\nJobDetails\022\020\n\010jobTitle\030\001 \001(\t" +
      "2\216\001\n\021ExtractionService\022y\n\016extractOrgJobs" +
      "\0221.com.example.grpc.scraper.proto.Extrac" +
      "tionRequest\0322.com.example.grpc.scraper.p" +
      "roto.ExtractionResponse0\001B\"\n\036com.example" +
      ".grpc.scraper.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_example_grpc_scraper_proto_ExtractionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_scraper_proto_ExtractionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_scraper_proto_ExtractionRequest_descriptor,
        new String[] { "OrgId", "Company", "ParamJson", });
    internal_static_com_example_grpc_scraper_proto_ExtractionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_scraper_proto_ExtractionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_scraper_proto_ExtractionResponse_descriptor,
        new String[] { "OrgId", "Company", "JobDetails", });
    internal_static_com_example_grpc_scraper_proto_JobDetails_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_grpc_scraper_proto_JobDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_scraper_proto_JobDetails_descriptor,
        new String[] { "JobTitle", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
