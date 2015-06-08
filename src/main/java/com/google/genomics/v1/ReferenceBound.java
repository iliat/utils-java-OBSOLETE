// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.ReferenceBound}
 *
 * <pre>
 * ReferenceBound records an upper bound for the starting coordinate of
 * variants in a particular reference.
 * </pre>
 */
public  final class ReferenceBound extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.ReferenceBound)
    ReferenceBoundOrBuilder {
  // Use ReferenceBound.newBuilder() to construct.
  private ReferenceBound(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private ReferenceBound() {
    referenceName_ = "";
    upperBound_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ReferenceBound(
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

            referenceName_ = bs;
            break;
          }
          case 16: {

            upperBound_ = input.readInt64();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_ReferenceBound_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_ReferenceBound_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.ReferenceBound.class, com.google.genomics.v1.ReferenceBound.Builder.class);
  }

  public static final com.google.protobuf.Parser<ReferenceBound> PARSER =
      new com.google.protobuf.AbstractParser<ReferenceBound>() {
    public ReferenceBound parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReferenceBound(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ReferenceBound> getParserForType() {
    return PARSER;
  }

  public static final int REFERENCE_NAME_FIELD_NUMBER = 1;
  private java.lang.Object referenceName_;
  /**
   * <code>optional string reference_name = 1;</code>
   *
   * <pre>
   * The reference the bound is associate with.
   * </pre>
   */
  public java.lang.String getReferenceName() {
    java.lang.Object ref = referenceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        referenceName_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string reference_name = 1;</code>
   *
   * <pre>
   * The reference the bound is associate with.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getReferenceNameBytes() {
    java.lang.Object ref = referenceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      referenceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPPER_BOUND_FIELD_NUMBER = 2;
  private long upperBound_;
  /**
   * <code>optional int64 upper_bound = 2;</code>
   *
   * <pre>
   * An upper bound (inclusive) on the starting coordinate of any
   * variant in the reference sequence.
   * </pre>
   */
  public long getUpperBound() {
    return upperBound_;
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
    if (!getReferenceNameBytes().isEmpty()) {
      output.writeBytes(1, getReferenceNameBytes());
    }
    if (upperBound_ != 0L) {
      output.writeInt64(2, upperBound_);
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getReferenceNameBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getReferenceNameBytes());
    }
    if (upperBound_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, upperBound_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.ReferenceBound parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ReferenceBound parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ReferenceBound parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.ReferenceBound parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.ReferenceBound parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.ReferenceBound parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.ReferenceBound parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.ReferenceBound parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.ReferenceBound parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.ReferenceBound parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.genomics.v1.ReferenceBound prototype) {
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
   * Protobuf type {@code google.genomics.v1.ReferenceBound}
   *
   * <pre>
   * ReferenceBound records an upper bound for the starting coordinate of
   * variants in a particular reference.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.ReferenceBound)
      com.google.genomics.v1.ReferenceBoundOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_ReferenceBound_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_ReferenceBound_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.ReferenceBound.class, com.google.genomics.v1.ReferenceBound.Builder.class);
    }

    // Construct using com.google.genomics.v1.ReferenceBound.newBuilder()
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
      referenceName_ = "";

      upperBound_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_ReferenceBound_descriptor;
    }

    public com.google.genomics.v1.ReferenceBound getDefaultInstanceForType() {
      return com.google.genomics.v1.ReferenceBound.getDefaultInstance();
    }

    public com.google.genomics.v1.ReferenceBound build() {
      com.google.genomics.v1.ReferenceBound result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.ReferenceBound buildPartial() {
      com.google.genomics.v1.ReferenceBound result = new com.google.genomics.v1.ReferenceBound(this);
      result.referenceName_ = referenceName_;
      result.upperBound_ = upperBound_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.ReferenceBound) {
        return mergeFrom((com.google.genomics.v1.ReferenceBound)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.ReferenceBound other) {
      if (other == com.google.genomics.v1.ReferenceBound.getDefaultInstance()) return this;
      if (!other.getReferenceName().isEmpty()) {
        referenceName_ = other.referenceName_;
        onChanged();
      }
      if (other.getUpperBound() != 0L) {
        setUpperBound(other.getUpperBound());
      }
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
      com.google.genomics.v1.ReferenceBound parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.ReferenceBound) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object referenceName_ = "";
    /**
     * <code>optional string reference_name = 1;</code>
     *
     * <pre>
     * The reference the bound is associate with.
     * </pre>
     */
    public java.lang.String getReferenceName() {
      java.lang.Object ref = referenceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          referenceName_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string reference_name = 1;</code>
     *
     * <pre>
     * The reference the bound is associate with.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getReferenceNameBytes() {
      java.lang.Object ref = referenceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        referenceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string reference_name = 1;</code>
     *
     * <pre>
     * The reference the bound is associate with.
     * </pre>
     */
    public Builder setReferenceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referenceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string reference_name = 1;</code>
     *
     * <pre>
     * The reference the bound is associate with.
     * </pre>
     */
    public Builder clearReferenceName() {
      
      referenceName_ = getDefaultInstance().getReferenceName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string reference_name = 1;</code>
     *
     * <pre>
     * The reference the bound is associate with.
     * </pre>
     */
    public Builder setReferenceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      referenceName_ = value;
      onChanged();
      return this;
    }

    private long upperBound_ ;
    /**
     * <code>optional int64 upper_bound = 2;</code>
     *
     * <pre>
     * An upper bound (inclusive) on the starting coordinate of any
     * variant in the reference sequence.
     * </pre>
     */
    public long getUpperBound() {
      return upperBound_;
    }
    /**
     * <code>optional int64 upper_bound = 2;</code>
     *
     * <pre>
     * An upper bound (inclusive) on the starting coordinate of any
     * variant in the reference sequence.
     * </pre>
     */
    public Builder setUpperBound(long value) {
      
      upperBound_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 upper_bound = 2;</code>
     *
     * <pre>
     * An upper bound (inclusive) on the starting coordinate of any
     * variant in the reference sequence.
     * </pre>
     */
    public Builder clearUpperBound() {
      
      upperBound_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.ReferenceBound)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.ReferenceBound)
  private static final com.google.genomics.v1.ReferenceBound defaultInstance;static {
    defaultInstance = new com.google.genomics.v1.ReferenceBound();
  }

  public static com.google.genomics.v1.ReferenceBound getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.genomics.v1.ReferenceBound getDefaultInstanceForType() {
    return defaultInstance;
  }

}
