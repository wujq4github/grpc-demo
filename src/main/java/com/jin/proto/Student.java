// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.jin.proto;

public final class Student {
  private Student() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StreamResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rStudent.proto\"\035\n\tMyRequest\022\020\n\010username" +
      "\030\001 \001(\t\"\036\n\nMyResponse\022\020\n\010realname\030\001 \001(\t\"\035" +
      "\n\016StudentRequest\022\013\n\003age\030\001 \001(\005\":\n\017Student" +
      "Response\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\014\n\004c" +
      "ity\030\003 \001(\t\"/\n\022StudentInfoRequest\022\014\n\004name\030" +
      "\001 \001(\t\022\013\n\003age\030\002 \001(\005\"%\n\023StudentInfoRespons" +
      "e\022\016\n\006status\030\001 \001(\t\"%\n\rStreamRequest\022\024\n\014re" +
      "quest_info\030\001 \001(\t\"\'\n\016StreamResponse\022\025\n\rre" +
      "sponse_info\030\001 \001(\t2\356\001\n\016StudentService\0221\n\024" +
      "getStudentByUsername\022\n.MyRequest\032\013.MyRes",
      "ponse\"\000\0229\n\020getStudentsByAge\022\017.StudentReq" +
      "uest\032\020.StudentResponse\"\0000\001\022=\n\014saveStuden" +
      "ts\022\023.StudentInfoRequest\032\024.StudentInfoRes" +
      "ponse\"\000(\001\022/\n\006BiTalk\022\016.StreamRequest\032\017.St" +
      "reamResponse\"\000(\0010\001B\032\n\rcom.jin.protoB\007Stu" +
      "dentP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MyRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MyResponse_descriptor,
        new java.lang.String[] { "Realname", });
    internal_static_StudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_StudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentRequest_descriptor,
        new java.lang.String[] { "Age", });
    internal_static_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentResponse_descriptor,
        new java.lang.String[] { "Name", "Age", "City", });
    internal_static_StudentInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_StudentInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentInfoRequest_descriptor,
        new java.lang.String[] { "Name", "Age", });
    internal_static_StudentInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_StudentInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentInfoResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_StreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_StreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StreamRequest_descriptor,
        new java.lang.String[] { "RequestInfo", });
    internal_static_StreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_StreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StreamResponse_descriptor,
        new java.lang.String[] { "ResponseInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
