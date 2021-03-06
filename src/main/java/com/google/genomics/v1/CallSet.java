// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.CallSet}
 *
 * <pre>
 * A call set is a collection of variant calls, typically for one sample. It
 * belongs to a variant set.
 * </pre>
 */
public  final class CallSet extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.CallSet)
    CallSetOrBuilder {
  // Use CallSet.newBuilder() to construct.
  private CallSet(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private CallSet() {
    id_ = "";
    name_ = "";
    sampleId_ = "";
    variantSetIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    created_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CallSet(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();

            id_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            name_ = bs;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              info_ = com.google.protobuf.MapField.newMapField(
                  infoDefaultEntry);
              mutable_bitField0_ |= 0x00000020;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ListValue>
            info = input.readMessage(
                infoDefaultEntry.getParserForType(), extensionRegistry);
            info_.getMutableMap().put(info.getKey(), info.getValue());
            break;
          }
          case 40: {

            created_ = input.readInt64();
            break;
          }
          case 50: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              variantSetIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            variantSetIds_.add(bs);
            break;
          }
          case 58: {
            com.google.protobuf.ByteString bs = input.readBytes();

            sampleId_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        variantSetIds_ = variantSetIds_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CallSet_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return info_;
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CallSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.CallSet.class, com.google.genomics.v1.CallSet.Builder.class);
  }

  public static final com.google.protobuf.Parser<CallSet> PARSER =
      new com.google.protobuf.AbstractParser<CallSet>() {
    public CallSet parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CallSet(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<CallSet> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.Object id_;
  /**
   * <code>optional string id = 1;</code>
   *
   * <pre>
   * The Google generated ID of the call set, immutable.
   * </pre>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        id_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string id = 1;</code>
   *
   * <pre>
   * The Google generated ID of the call set, immutable.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private java.lang.Object name_;
  /**
   * <code>optional string name = 2;</code>
   *
   * <pre>
   * The call set name.
   * </pre>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        name_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string name = 2;</code>
   *
   * <pre>
   * The call set name.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SAMPLE_ID_FIELD_NUMBER = 7;
  private java.lang.Object sampleId_;
  /**
   * <code>optional string sample_id = 7;</code>
   *
   * <pre>
   * The sample ID this call set corresponds to.
   * </pre>
   */
  public java.lang.String getSampleId() {
    java.lang.Object ref = sampleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        sampleId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string sample_id = 7;</code>
   *
   * <pre>
   * The sample ID this call set corresponds to.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getSampleIdBytes() {
    java.lang.Object ref = sampleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sampleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VARIANT_SET_IDS_FIELD_NUMBER = 6;
  private com.google.protobuf.LazyStringList variantSetIds_;
  /**
   * <code>repeated string variant_set_ids = 6;</code>
   *
   * <pre>
   * The IDs of the variant sets this call set belongs to.
   * </pre>
   */
  public com.google.protobuf.ProtocolStringList
      getVariantSetIdsList() {
    return variantSetIds_;
  }
  /**
   * <code>repeated string variant_set_ids = 6;</code>
   *
   * <pre>
   * The IDs of the variant sets this call set belongs to.
   * </pre>
   */
  public int getVariantSetIdsCount() {
    return variantSetIds_.size();
  }
  /**
   * <code>repeated string variant_set_ids = 6;</code>
   *
   * <pre>
   * The IDs of the variant sets this call set belongs to.
   * </pre>
   */
  public java.lang.String getVariantSetIds(int index) {
    return variantSetIds_.get(index);
  }
  /**
   * <code>repeated string variant_set_ids = 6;</code>
   *
   * <pre>
   * The IDs of the variant sets this call set belongs to.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getVariantSetIdsBytes(int index) {
    return variantSetIds_.getByteString(index);
  }

  public static final int CREATED_FIELD_NUMBER = 5;
  private long created_;
  /**
   * <code>optional int64 created = 5;</code>
   *
   * <pre>
   * The date this call set was created in milliseconds from the epoch.
   * </pre>
   */
  public long getCreated() {
    return created_;
  }

  public static final int INFO_FIELD_NUMBER = 4;
  private static final com.google.protobuf.MapEntry<
      java.lang.String, com.google.protobuf.ListValue> infoDefaultEntry =
          com.google.protobuf.MapEntry
          .<java.lang.String, com.google.protobuf.ListValue>newDefaultInstance(
              com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CallSet_InfoEntry_descriptor, 
              com.google.protobuf.WireFormat.FieldType.STRING,
              "",
              com.google.protobuf.WireFormat.FieldType.MESSAGE,
              com.google.protobuf.ListValue.getDefaultInstance());
  private com.google.protobuf.MapField<
      java.lang.String, com.google.protobuf.ListValue> info_ =
          com.google.protobuf.MapField.emptyMapField(
              infoDefaultEntry);

  /**
   * <code>map&lt;string, .google.protobuf.ListValue&gt; info = 4;</code>
   *
   * <pre>
   * A map of additional call set information. This must be of the form
   * map&lt;string, string[]&gt; (string key mapping to a list of string values).
   * </pre>
   */

  public java.util.Map<java.lang.String, com.google.protobuf.ListValue> getInfo() {
    return info_.getMap();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!getIdBytes().isEmpty()) {
      output.writeBytes(1, getIdBytes());
    }
    if (!getNameBytes().isEmpty()) {
      output.writeBytes(2, getNameBytes());
    }
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.ListValue> entry
         : info_.getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ListValue>
      info = infoDefaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      output.writeMessage(4, info);
    }
    if (created_ != 0L) {
      output.writeInt64(5, created_);
    }
    for (int i = 0; i < variantSetIds_.size(); i++) {
      output.writeBytes(6, variantSetIds_.getByteString(i));
    }
    if (!getSampleIdBytes().isEmpty()) {
      output.writeBytes(7, getSampleIdBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getIdBytes());
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getNameBytes());
    }
    for (java.util.Map.Entry<java.lang.String, com.google.protobuf.ListValue> entry
         : info_.getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.protobuf.ListValue>
      info = infoDefaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, info);
    }
    if (created_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, created_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < variantSetIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(variantSetIds_.getByteString(i));
      }
      size += dataSize;
      size += 1 * getVariantSetIdsList().size();
    }
    if (!getSampleIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, getSampleIdBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.CallSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CallSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CallSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.CallSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.CallSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.CallSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.CallSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.CallSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.CallSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.CallSet parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.genomics.v1.CallSet prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.genomics.v1.CallSet}
   *
   * <pre>
   * A call set is a collection of variant calls, typically for one sample. It
   * belongs to a variant set.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.CallSet)
      com.google.genomics.v1.CallSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CallSet_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return info_;
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CallSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.CallSet.class, com.google.genomics.v1.CallSet.Builder.class);
    }

    // Construct using com.google.genomics.v1.CallSet.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      id_ = "";

      name_ = "";

      sampleId_ = "";

      variantSetIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      created_ = 0L;

      info_.clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_CallSet_descriptor;
    }

    public com.google.genomics.v1.CallSet getDefaultInstanceForType() {
      return com.google.genomics.v1.CallSet.getDefaultInstance();
    }

    public com.google.genomics.v1.CallSet build() {
      com.google.genomics.v1.CallSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.CallSet buildPartial() {
      com.google.genomics.v1.CallSet result = new com.google.genomics.v1.CallSet(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.name_ = name_;
      result.sampleId_ = sampleId_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        variantSetIds_ = variantSetIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.variantSetIds_ = variantSetIds_;
      result.created_ = created_;
      result.info_ = info_.copy();
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.CallSet) {
        return mergeFrom((com.google.genomics.v1.CallSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.CallSet other) {
      if (other == com.google.genomics.v1.CallSet.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getSampleId().isEmpty()) {
        sampleId_ = other.sampleId_;
        onChanged();
      }
      if (!other.variantSetIds_.isEmpty()) {
        if (variantSetIds_.isEmpty()) {
          variantSetIds_ = other.variantSetIds_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureVariantSetIdsIsMutable();
          variantSetIds_.addAll(other.variantSetIds_);
        }
        onChanged();
      }
      if (other.getCreated() != 0L) {
        setCreated(other.getCreated());
      }
      info_.mergeFrom(other.info_);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.genomics.v1.CallSet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.CallSet) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * The Google generated ID of the call set, immutable.
     * </pre>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          id_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * The Google generated ID of the call set, immutable.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * The Google generated ID of the call set, immutable.
     * </pre>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * The Google generated ID of the call set, immutable.
     * </pre>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * The Google generated ID of the call set, immutable.
     * </pre>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 2;</code>
     *
     * <pre>
     * The call set name.
     * </pre>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     *
     * <pre>
     * The call set name.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     *
     * <pre>
     * The call set name.
     * </pre>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     *
     * <pre>
     * The call set name.
     * </pre>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     *
     * <pre>
     * The call set name.
     * </pre>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sampleId_ = "";
    /**
     * <code>optional string sample_id = 7;</code>
     *
     * <pre>
     * The sample ID this call set corresponds to.
     * </pre>
     */
    public java.lang.String getSampleId() {
      java.lang.Object ref = sampleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sampleId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string sample_id = 7;</code>
     *
     * <pre>
     * The sample ID this call set corresponds to.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSampleIdBytes() {
      java.lang.Object ref = sampleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sampleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string sample_id = 7;</code>
     *
     * <pre>
     * The sample ID this call set corresponds to.
     * </pre>
     */
    public Builder setSampleId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sampleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string sample_id = 7;</code>
     *
     * <pre>
     * The sample ID this call set corresponds to.
     * </pre>
     */
    public Builder clearSampleId() {
      
      sampleId_ = getDefaultInstance().getSampleId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string sample_id = 7;</code>
     *
     * <pre>
     * The sample ID this call set corresponds to.
     * </pre>
     */
    public Builder setSampleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sampleId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList variantSetIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureVariantSetIdsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        variantSetIds_ = new com.google.protobuf.LazyStringArrayList(variantSetIds_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string variant_set_ids = 6;</code>
     *
     * <pre>
     * The IDs of the variant sets this call set belongs to.
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getVariantSetIdsList() {
      return variantSetIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string variant_set_ids = 6;</code>
     *
     * <pre>
     * The IDs of the variant sets this call set belongs to.
     * </pre>
     */
    public int getVariantSetIdsCount() {
      return variantSetIds_.size();
    }
    /**
     * <code>repeated string variant_set_ids = 6;</code>
     *
     * <pre>
     * The IDs of the variant sets this call set belongs to.
     * </pre>
     */
    public java.lang.String getVariantSetIds(int index) {
      return variantSetIds_.get(index);
    }
    /**
     * <code>repeated string variant_set_ids = 6;</code>
     *
     * <pre>
     * The IDs of the variant sets this call set belongs to.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getVariantSetIdsBytes(int index) {
      return variantSetIds_.getByteString(index);
    }
    /**
     * <code>repeated string variant_set_ids = 6;</code>
     *
     * <pre>
     * The IDs of the variant sets this call set belongs to.
     * </pre>
     */
    public Builder setVariantSetIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureVariantSetIdsIsMutable();
      variantSetIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string variant_set_ids = 6;</code>
     *
     * <pre>
     * The IDs of the variant sets this call set belongs to.
     * </pre>
     */
    public Builder addVariantSetIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureVariantSetIdsIsMutable();
      variantSetIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string variant_set_ids = 6;</code>
     *
     * <pre>
     * The IDs of the variant sets this call set belongs to.
     * </pre>
     */
    public Builder addAllVariantSetIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureVariantSetIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, variantSetIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string variant_set_ids = 6;</code>
     *
     * <pre>
     * The IDs of the variant sets this call set belongs to.
     * </pre>
     */
    public Builder clearVariantSetIds() {
      variantSetIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string variant_set_ids = 6;</code>
     *
     * <pre>
     * The IDs of the variant sets this call set belongs to.
     * </pre>
     */
    public Builder addVariantSetIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureVariantSetIdsIsMutable();
      variantSetIds_.add(value);
      onChanged();
      return this;
    }

    private long created_ ;
    /**
     * <code>optional int64 created = 5;</code>
     *
     * <pre>
     * The date this call set was created in milliseconds from the epoch.
     * </pre>
     */
    public long getCreated() {
      return created_;
    }
    /**
     * <code>optional int64 created = 5;</code>
     *
     * <pre>
     * The date this call set was created in milliseconds from the epoch.
     * </pre>
     */
    public Builder setCreated(long value) {
      
      created_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 created = 5;</code>
     *
     * <pre>
     * The date this call set was created in milliseconds from the epoch.
     * </pre>
     */
    public Builder clearCreated() {
      
      created_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, com.google.protobuf.ListValue> info_ =
            com.google.protobuf.MapField.newMapField(
                infoDefaultEntry);

    /**
     * <code>map&lt;string, .google.protobuf.ListValue&gt; info = 4;</code>
     *
     * <pre>
     * A map of additional call set information. This must be of the form
     * map&lt;string, string[]&gt; (string key mapping to a list of string values).
     * </pre>
     */
    public java.util.Map<java.lang.String, com.google.protobuf.ListValue> getInfo() {
      return info_.getMap();
    }
    /**
     * <code>map&lt;string, .google.protobuf.ListValue&gt; info = 4;</code>
     *
     * <pre>
     * A map of additional call set information. This must be of the form
     * map&lt;string, string[]&gt; (string key mapping to a list of string values).
     * </pre>
     */
    public java.util.Map<java.lang.String, com.google.protobuf.ListValue>
    getMutableInfo() {
      onChanged();
      return info_.getMutableMap();
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.CallSet)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.CallSet)
  private static final com.google.genomics.v1.CallSet defaultInstance;static {
    defaultInstance = new com.google.genomics.v1.CallSet();
  }

  public static com.google.genomics.v1.CallSet getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.genomics.v1.CallSet getDefaultInstanceForType() {
    return defaultInstance;
  }

}

