// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * List mapping response
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListMappingsResponse}
 */
public final class ListMappingsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.ListMappingsResponse)
    ListMappingsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListMappingsResponse.newBuilder() to construct.
  private ListMappingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListMappingsResponse() {
    mapping_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListMappingsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListMappingsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              mapping_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.Mapping>();
              mutable_bitField0_ |= 0x00000001;
            }
            mapping_.add(
                input.readMessage(opi_api.network.cloud.v1alpha1.Mapping.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        mapping_ = java.util.Collections.unmodifiableList(mapping_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListMappingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListMappingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.ListMappingsResponse.class, opi_api.network.cloud.v1alpha1.ListMappingsResponse.Builder.class);
  }

  public static final int MAPPING_FIELD_NUMBER = 1;
  private java.util.List<opi_api.network.cloud.v1alpha1.Mapping> mapping_;
  /**
   * <pre>
   * list of mappings
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.network.cloud.v1alpha1.Mapping> getMappingList() {
    return mapping_;
  }
  /**
   * <pre>
   * list of mappings
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.network.cloud.v1alpha1.MappingOrBuilder> 
      getMappingOrBuilderList() {
    return mapping_;
  }
  /**
   * <pre>
   * list of mappings
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
   */
  @java.lang.Override
  public int getMappingCount() {
    return mapping_.size();
  }
  /**
   * <pre>
   * list of mappings
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.Mapping getMapping(int index) {
    return mapping_.get(index);
  }
  /**
   * <pre>
   * list of mappings
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.MappingOrBuilder getMappingOrBuilder(
      int index) {
    return mapping_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < mapping_.size(); i++) {
      output.writeMessage(1, mapping_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mapping_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mapping_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.ListMappingsResponse)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.ListMappingsResponse other = (opi_api.network.cloud.v1alpha1.ListMappingsResponse) obj;

    if (!getMappingList()
        .equals(other.getMappingList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getMappingCount() > 0) {
      hash = (37 * hash) + MAPPING_FIELD_NUMBER;
      hash = (53 * hash) + getMappingList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.ListMappingsResponse prototype) {
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
   * <pre>
   * List mapping response
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.ListMappingsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.ListMappingsResponse)
      opi_api.network.cloud.v1alpha1.ListMappingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListMappingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListMappingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.ListMappingsResponse.class, opi_api.network.cloud.v1alpha1.ListMappingsResponse.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.ListMappingsResponse.newBuilder()
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
        getMappingFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mappingBuilder_ == null) {
        mapping_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mappingBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_ListMappingsResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListMappingsResponse getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.ListMappingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListMappingsResponse build() {
      opi_api.network.cloud.v1alpha1.ListMappingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.ListMappingsResponse buildPartial() {
      opi_api.network.cloud.v1alpha1.ListMappingsResponse result = new opi_api.network.cloud.v1alpha1.ListMappingsResponse(this);
      int from_bitField0_ = bitField0_;
      if (mappingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mapping_ = java.util.Collections.unmodifiableList(mapping_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mapping_ = mapping_;
      } else {
        result.mapping_ = mappingBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof opi_api.network.cloud.v1alpha1.ListMappingsResponse) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.ListMappingsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.ListMappingsResponse other) {
      if (other == opi_api.network.cloud.v1alpha1.ListMappingsResponse.getDefaultInstance()) return this;
      if (mappingBuilder_ == null) {
        if (!other.mapping_.isEmpty()) {
          if (mapping_.isEmpty()) {
            mapping_ = other.mapping_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMappingIsMutable();
            mapping_.addAll(other.mapping_);
          }
          onChanged();
        }
      } else {
        if (!other.mapping_.isEmpty()) {
          if (mappingBuilder_.isEmpty()) {
            mappingBuilder_.dispose();
            mappingBuilder_ = null;
            mapping_ = other.mapping_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mappingBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMappingFieldBuilder() : null;
          } else {
            mappingBuilder_.addAllMessages(other.mapping_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      opi_api.network.cloud.v1alpha1.ListMappingsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.ListMappingsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.network.cloud.v1alpha1.Mapping> mapping_ =
      java.util.Collections.emptyList();
    private void ensureMappingIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mapping_ = new java.util.ArrayList<opi_api.network.cloud.v1alpha1.Mapping>(mapping_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Mapping, opi_api.network.cloud.v1alpha1.Mapping.Builder, opi_api.network.cloud.v1alpha1.MappingOrBuilder> mappingBuilder_;

    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.Mapping> getMappingList() {
      if (mappingBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mapping_);
      } else {
        return mappingBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public int getMappingCount() {
      if (mappingBuilder_ == null) {
        return mapping_.size();
      } else {
        return mappingBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Mapping getMapping(int index) {
      if (mappingBuilder_ == null) {
        return mapping_.get(index);
      } else {
        return mappingBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public Builder setMapping(
        int index, opi_api.network.cloud.v1alpha1.Mapping value) {
      if (mappingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMappingIsMutable();
        mapping_.set(index, value);
        onChanged();
      } else {
        mappingBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public Builder setMapping(
        int index, opi_api.network.cloud.v1alpha1.Mapping.Builder builderForValue) {
      if (mappingBuilder_ == null) {
        ensureMappingIsMutable();
        mapping_.set(index, builderForValue.build());
        onChanged();
      } else {
        mappingBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public Builder addMapping(opi_api.network.cloud.v1alpha1.Mapping value) {
      if (mappingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMappingIsMutable();
        mapping_.add(value);
        onChanged();
      } else {
        mappingBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public Builder addMapping(
        int index, opi_api.network.cloud.v1alpha1.Mapping value) {
      if (mappingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMappingIsMutable();
        mapping_.add(index, value);
        onChanged();
      } else {
        mappingBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public Builder addMapping(
        opi_api.network.cloud.v1alpha1.Mapping.Builder builderForValue) {
      if (mappingBuilder_ == null) {
        ensureMappingIsMutable();
        mapping_.add(builderForValue.build());
        onChanged();
      } else {
        mappingBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public Builder addMapping(
        int index, opi_api.network.cloud.v1alpha1.Mapping.Builder builderForValue) {
      if (mappingBuilder_ == null) {
        ensureMappingIsMutable();
        mapping_.add(index, builderForValue.build());
        onChanged();
      } else {
        mappingBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public Builder addAllMapping(
        java.lang.Iterable<? extends opi_api.network.cloud.v1alpha1.Mapping> values) {
      if (mappingBuilder_ == null) {
        ensureMappingIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mapping_);
        onChanged();
      } else {
        mappingBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public Builder clearMapping() {
      if (mappingBuilder_ == null) {
        mapping_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mappingBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public Builder removeMapping(int index) {
      if (mappingBuilder_ == null) {
        ensureMappingIsMutable();
        mapping_.remove(index);
        onChanged();
      } else {
        mappingBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Mapping.Builder getMappingBuilder(
        int index) {
      return getMappingFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.MappingOrBuilder getMappingOrBuilder(
        int index) {
      if (mappingBuilder_ == null) {
        return mapping_.get(index);  } else {
        return mappingBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public java.util.List<? extends opi_api.network.cloud.v1alpha1.MappingOrBuilder> 
         getMappingOrBuilderList() {
      if (mappingBuilder_ != null) {
        return mappingBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mapping_);
      }
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Mapping.Builder addMappingBuilder() {
      return getMappingFieldBuilder().addBuilder(
          opi_api.network.cloud.v1alpha1.Mapping.getDefaultInstance());
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Mapping.Builder addMappingBuilder(
        int index) {
      return getMappingFieldBuilder().addBuilder(
          index, opi_api.network.cloud.v1alpha1.Mapping.getDefaultInstance());
    }
    /**
     * <pre>
     * list of mappings
     * </pre>
     *
     * <code>repeated .opi_api.network.cloud.v1alpha1.Mapping mapping = 1;</code>
     */
    public java.util.List<opi_api.network.cloud.v1alpha1.Mapping.Builder> 
         getMappingBuilderList() {
      return getMappingFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Mapping, opi_api.network.cloud.v1alpha1.Mapping.Builder, opi_api.network.cloud.v1alpha1.MappingOrBuilder> 
        getMappingFieldBuilder() {
      if (mappingBuilder_ == null) {
        mappingBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.Mapping, opi_api.network.cloud.v1alpha1.Mapping.Builder, opi_api.network.cloud.v1alpha1.MappingOrBuilder>(
                mapping_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mapping_ = null;
      }
      return mappingBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * next page token
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.ListMappingsResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.ListMappingsResponse)
  private static final opi_api.network.cloud.v1alpha1.ListMappingsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.ListMappingsResponse();
  }

  public static opi_api.network.cloud.v1alpha1.ListMappingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMappingsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListMappingsResponse>() {
    @java.lang.Override
    public ListMappingsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListMappingsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListMappingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMappingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.ListMappingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
