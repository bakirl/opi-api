// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend_qos_volume.proto

package opi_api.storage.v1;

public final class MiddleendQosVolumeProto {
  private MiddleendQosVolumeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_QosVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_QosVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_CreateQosVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_CreateQosVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_DeleteQosVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_DeleteQosVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_UpdateQosVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_UpdateQosVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListQosVolumesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListQosVolumesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_ListQosVolumesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_ListQosVolumesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_GetQosVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_GetQosVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_QosVolumeStatsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_QosVolumeStatsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_storage_v1_QosVolumeStatsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_storage_v1_QosVolumeStatsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032middleend_qos_volume.proto\022\022opi_api.st" +
      "orage.v1\032\017opicommon.proto\032\020object_key.pr" +
      "oto\032\027google/api/client.proto\032\031google/api" +
      "/resource.proto\032\033google/protobuf/empty.p" +
      "roto\032\034google/api/annotations.proto\032\037goog" +
      "le/api/field_behavior.proto\032 google/prot" +
      "obuf/field_mask.proto\"\345\001\n\tQosVolume\022\014\n\004n" +
      "ame\030\001 \001(\t\022/\n\tvolume_id\030\002 \001(\0132\034.opi_api.c" +
      "ommon.v1.ObjectKey\022/\n\tlimit_min\030\003 \001(\0132\034." +
      "opi_api.storage.v1.QosLimit\022/\n\tlimit_max" +
      "\030\004 \001(\0132\034.opi_api.storage.v1.QosLimit:7\352A" +
      "4\n storage.opiproject.org/QosVolume\022\020vol" +
      "umes/{volume}\"g\n\026CreateQosVolumeRequest\022" +
      "6\n\nqos_volume\030\002 \001(\0132\035.opi_api.storage.v1" +
      ".QosVolumeB\003\340A\002\022\025\n\rqos_volume_id\030\003 \001(\t\"c" +
      "\n\026DeleteQosVolumeRequest\0222\n\004name\030\001 \001(\tB$" +
      "\340A\002\372A\036\n\034opi_api.storage.v1/QosVolume\022\025\n\r" +
      "allow_missing\030\002 \001(\010\"|\n\026UpdateQosVolumeRe" +
      "quest\0221\n\nqos_volume\030\001 \001(\0132\035.opi_api.stor" +
      "age.v1.QosVolume\022/\n\013update_mask\030\002 \001(\0132\032." +
      "google.protobuf.FieldMask\"t\n\025ListQosVolu" +
      "mesRequest\0224\n\006parent\030\001 \001(\tB$\340A\002\372A\036\n\034opi_" +
      "api.storage.v1/QosVolume\022\021\n\tpage_size\030\002 " +
      "\001(\005\022\022\n\npage_token\030\003 \001(\t\"e\n\026ListQosVolume" +
      "sResponse\0222\n\013qos_volumes\030\001 \003(\0132\035.opi_api" +
      ".storage.v1.QosVolume\022\027\n\017next_page_token" +
      "\030\002 \001(\t\"I\n\023GetQosVolumeRequest\0222\n\004name\030\001 " +
      "\001(\tB$\340A\002\372A\036\n\034opi_api.storage.v1/QosVolum" +
      "e\"H\n\025QosVolumeStatsRequest\022/\n\tvolume_id\030" +
      "\001 \001(\0132\034.opi_api.common.v1.ObjectKey\"r\n\026Q" +
      "osVolumeStatsResponse\022(\n\002id\030\001 \001(\0132\034.opi_" +
      "api.common.v1.ObjectKey\022.\n\005stats\030\002 \001(\0132\037" +
      ".opi_api.storage.v1.VolumeStats2\366\006\n\031Midd" +
      "leendQosVolumeService\022\230\001\n\017CreateQosVolum" +
      "e\022*.opi_api.storage.v1.CreateQosVolumeRe" +
      "quest\032\035.opi_api.storage.v1.QosVolume\":\202\323" +
      "\344\223\002\031\"\013/v1/volumes:\nqos_volume\332A\030qos_volu" +
      "me,qos_volume_id\022\207\001\n\017DeleteQosVolume\022*.o" +
      "pi_api.storage.v1.DeleteQosVolumeRequest" +
      "\032\026.google.protobuf.Empty\"0\202\323\344\223\002#*!/v1/{n" +
      "ame=qosvolumes}/{qosvolume}\332A\004name\022\253\001\n\017U" +
      "pdateQosVolume\022*.opi_api.storage.v1.Upda" +
      "teQosVolumeRequest\032\035.opi_api.storage.v1." +
      "QosVolume\"M\202\323\344\223\002.2 /v1/{qos_volume.name=" +
      "subsystems}:\nqos_volume\332A\026qos_volume,upd" +
      "ate_mask\022\216\001\n\016ListQosVolumes\022).opi_api.st" +
      "orage.v1.ListQosVolumesRequest\032*.opi_api" +
      ".storage.v1.ListQosVolumesResponse\"%\202\323\344\223" +
      "\002\026\022\024/v1/{parent=volumes}\332A\006parent\022\211\001\n\014Ge" +
      "tQosVolume\022\'.opi_api.storage.v1.GetQosVo" +
      "lumeRequest\032\035.opi_api.storage.v1.QosVolu" +
      "me\"1\202\323\344\223\002$\022\"/v1/{name=subsystems}/{qos_v" +
      "olume}\332A\004name\022i\n\016QosVolumeStats\022).opi_ap" +
      "i.storage.v1.QosVolumeStatsRequest\032*.opi" +
      "_api.storage.v1.QosVolumeStatsResponse\"\000" +
      "Bf\n\022opi_api.storage.v1B\027MiddleendQosVolu" +
      "meProtoP\001Z5github.com/opiproject/opi-api" +
      "/storage/v1alpha1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.storage.v1.OpiCommonProto.getDescriptor(),
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_opi_api_storage_v1_QosVolume_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_storage_v1_QosVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_QosVolume_descriptor,
        new java.lang.String[] { "Name", "VolumeId", "LimitMin", "LimitMax", });
    internal_static_opi_api_storage_v1_CreateQosVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_storage_v1_CreateQosVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_CreateQosVolumeRequest_descriptor,
        new java.lang.String[] { "QosVolume", "QosVolumeId", });
    internal_static_opi_api_storage_v1_DeleteQosVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_storage_v1_DeleteQosVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_DeleteQosVolumeRequest_descriptor,
        new java.lang.String[] { "Name", "AllowMissing", });
    internal_static_opi_api_storage_v1_UpdateQosVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_storage_v1_UpdateQosVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_UpdateQosVolumeRequest_descriptor,
        new java.lang.String[] { "QosVolume", "UpdateMask", });
    internal_static_opi_api_storage_v1_ListQosVolumesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_storage_v1_ListQosVolumesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListQosVolumesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_storage_v1_ListQosVolumesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_storage_v1_ListQosVolumesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_ListQosVolumesResponse_descriptor,
        new java.lang.String[] { "QosVolumes", "NextPageToken", });
    internal_static_opi_api_storage_v1_GetQosVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_storage_v1_GetQosVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_GetQosVolumeRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_storage_v1_QosVolumeStatsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_storage_v1_QosVolumeStatsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_QosVolumeStatsRequest_descriptor,
        new java.lang.String[] { "VolumeId", });
    internal_static_opi_api_storage_v1_QosVolumeStatsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_opi_api_storage_v1_QosVolumeStatsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_storage_v1_QosVolumeStatsResponse_descriptor,
        new java.lang.String[] { "Id", "Stats", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    opi_api.storage.v1.OpiCommonProto.getDescriptor();
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}