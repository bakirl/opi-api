// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.VirtioBlkCreateRequest}
 */
public final class VirtioBlkCreateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.VirtioBlkCreateRequest)
    VirtioBlkCreateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VirtioBlkCreateRequest.newBuilder() to construct.
  private VirtioBlkCreateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VirtioBlkCreateRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VirtioBlkCreateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VirtioBlkCreateRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            opi_api.storage.v1.VirtioBlk.Builder subBuilder = null;
            if (controller_ != null) {
              subBuilder = controller_.toBuilder();
            }
            controller_ = input.readMessage(opi_api.storage.v1.VirtioBlk.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(controller_);
              controller_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlkCreateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlkCreateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.VirtioBlkCreateRequest.class, opi_api.storage.v1.VirtioBlkCreateRequest.Builder.class);
  }

  public static final int CONTROLLER_FIELD_NUMBER = 1;
  private opi_api.storage.v1.VirtioBlk controller_;
  /**
   * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
   * @return Whether the controller field is set.
   */
  @java.lang.Override
  public boolean hasController() {
    return controller_ != null;
  }
  /**
   * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
   * @return The controller.
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioBlk getController() {
    return controller_ == null ? opi_api.storage.v1.VirtioBlk.getDefaultInstance() : controller_;
  }
  /**
   * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
   */
  @java.lang.Override
  public opi_api.storage.v1.VirtioBlkOrBuilder getControllerOrBuilder() {
    return getController();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (controller_ != null) {
      output.writeMessage(1, getController());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (controller_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getController());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.storage.v1.VirtioBlkCreateRequest)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.VirtioBlkCreateRequest other = (opi_api.storage.v1.VirtioBlkCreateRequest) obj;

    if (hasController() != other.hasController()) return false;
    if (hasController()) {
      if (!getController()
          .equals(other.getController())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasController()) {
      hash = (37 * hash) + CONTROLLER_FIELD_NUMBER;
      hash = (53 * hash) + getController().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.VirtioBlkCreateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.VirtioBlkCreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.VirtioBlkCreateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code opi_api.storage.v1.VirtioBlkCreateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.VirtioBlkCreateRequest)
      opi_api.storage.v1.VirtioBlkCreateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlkCreateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlkCreateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.VirtioBlkCreateRequest.class, opi_api.storage.v1.VirtioBlkCreateRequest.Builder.class);
    }

    // Construct using opi_api.storage.v1.VirtioBlkCreateRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (controllerBuilder_ == null) {
        controller_ = null;
      } else {
        controller_ = null;
        controllerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendVirtioBlkProto.internal_static_opi_api_storage_v1_VirtioBlkCreateRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioBlkCreateRequest getDefaultInstanceForType() {
      return opi_api.storage.v1.VirtioBlkCreateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioBlkCreateRequest build() {
      opi_api.storage.v1.VirtioBlkCreateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.VirtioBlkCreateRequest buildPartial() {
      opi_api.storage.v1.VirtioBlkCreateRequest result = new opi_api.storage.v1.VirtioBlkCreateRequest(this);
      if (controllerBuilder_ == null) {
        result.controller_ = controller_;
      } else {
        result.controller_ = controllerBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.VirtioBlkCreateRequest) {
        return mergeFrom((opi_api.storage.v1.VirtioBlkCreateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.VirtioBlkCreateRequest other) {
      if (other == opi_api.storage.v1.VirtioBlkCreateRequest.getDefaultInstance()) return this;
      if (other.hasController()) {
        mergeController(other.getController());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.storage.v1.VirtioBlkCreateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.VirtioBlkCreateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.storage.v1.VirtioBlk controller_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder> controllerBuilder_;
    /**
     * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
     * @return Whether the controller field is set.
     */
    public boolean hasController() {
      return controllerBuilder_ != null || controller_ != null;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
     * @return The controller.
     */
    public opi_api.storage.v1.VirtioBlk getController() {
      if (controllerBuilder_ == null) {
        return controller_ == null ? opi_api.storage.v1.VirtioBlk.getDefaultInstance() : controller_;
      } else {
        return controllerBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder setController(opi_api.storage.v1.VirtioBlk value) {
      if (controllerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        controller_ = value;
        onChanged();
      } else {
        controllerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder setController(
        opi_api.storage.v1.VirtioBlk.Builder builderForValue) {
      if (controllerBuilder_ == null) {
        controller_ = builderForValue.build();
        onChanged();
      } else {
        controllerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder mergeController(opi_api.storage.v1.VirtioBlk value) {
      if (controllerBuilder_ == null) {
        if (controller_ != null) {
          controller_ =
            opi_api.storage.v1.VirtioBlk.newBuilder(controller_).mergeFrom(value).buildPartial();
        } else {
          controller_ = value;
        }
        onChanged();
      } else {
        controllerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public Builder clearController() {
      if (controllerBuilder_ == null) {
        controller_ = null;
        onChanged();
      } else {
        controller_ = null;
        controllerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlk.Builder getControllerBuilder() {
      
      onChanged();
      return getControllerFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    public opi_api.storage.v1.VirtioBlkOrBuilder getControllerOrBuilder() {
      if (controllerBuilder_ != null) {
        return controllerBuilder_.getMessageOrBuilder();
      } else {
        return controller_ == null ?
            opi_api.storage.v1.VirtioBlk.getDefaultInstance() : controller_;
      }
    }
    /**
     * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder> 
        getControllerFieldBuilder() {
      if (controllerBuilder_ == null) {
        controllerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.storage.v1.VirtioBlk, opi_api.storage.v1.VirtioBlk.Builder, opi_api.storage.v1.VirtioBlkOrBuilder>(
                getController(),
                getParentForChildren(),
                isClean());
        controller_ = null;
      }
      return controllerBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.VirtioBlkCreateRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkCreateRequest)
  private static final opi_api.storage.v1.VirtioBlkCreateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.VirtioBlkCreateRequest();
  }

  public static opi_api.storage.v1.VirtioBlkCreateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VirtioBlkCreateRequest>
      PARSER = new com.google.protobuf.AbstractParser<VirtioBlkCreateRequest>() {
    @java.lang.Override
    public VirtioBlkCreateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VirtioBlkCreateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VirtioBlkCreateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VirtioBlkCreateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.VirtioBlkCreateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
