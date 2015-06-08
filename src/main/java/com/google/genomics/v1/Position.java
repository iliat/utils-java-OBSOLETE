// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/position.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.Position}
 *
 * <pre>
 * An abstraction for referring to a genomic position, in relation to some
 * already known reference. For now, represents a genomic position as a
 * reference name, a base number on that reference (0-based), and a
 * determination of forward or reverse strand.
 * </pre>
 */
public  final class Position extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.Position)
    PositionOrBuilder {
  // Use Position.newBuilder() to construct.
  private Position(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private Position() {
    referenceName_ = "";
    position_ = 0L;
    reverseStrand_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Position(
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

            position_ = input.readInt64();
            break;
          }
          case 24: {

            reverseStrand_ = input.readBool();
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
    return com.google.genomics.v1.PositionProto.internal_static_google_genomics_v1_Position_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.PositionProto.internal_static_google_genomics_v1_Position_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.Position.class, com.google.genomics.v1.Position.Builder.class);
  }

  public static final com.google.protobuf.Parser<Position> PARSER =
      new com.google.protobuf.AbstractParser<Position>() {
    public Position parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Position(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<Position> getParserForType() {
    return PARSER;
  }

  public static final int REFERENCE_NAME_FIELD_NUMBER = 1;
  private java.lang.Object referenceName_;
  /**
   * <code>optional string reference_name = 1;</code>
   *
   * <pre>
   * The name of the reference in whatever reference set is being used.
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
   * The name of the reference in whatever reference set is being used.
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

  public static final int POSITION_FIELD_NUMBER = 2;
  private long position_;
  /**
   * <code>optional int64 position = 2;</code>
   *
   * <pre>
   * The 0-based offset from the start of the forward strand for that reference.
   * </pre>
   */
  public long getPosition() {
    return position_;
  }

  public static final int REVERSE_STRAND_FIELD_NUMBER = 3;
  private boolean reverseStrand_;
  /**
   * <code>optional bool reverse_strand = 3;</code>
   *
   * <pre>
   * Whether this position is on the reverse strand, as opposed to the forward
   * strand.
   * </pre>
   */
  public boolean getReverseStrand() {
    return reverseStrand_;
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
    if (position_ != 0L) {
      output.writeInt64(2, position_);
    }
    if (reverseStrand_ != false) {
      output.writeBool(3, reverseStrand_);
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
    if (position_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, position_);
    }
    if (reverseStrand_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, reverseStrand_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.Position parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.Position parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.Position parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.Position parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.Position parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.Position parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.Position parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.Position parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.Position parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.Position parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.genomics.v1.Position prototype) {
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
   * Protobuf type {@code google.genomics.v1.Position}
   *
   * <pre>
   * An abstraction for referring to a genomic position, in relation to some
   * already known reference. For now, represents a genomic position as a
   * reference name, a base number on that reference (0-based), and a
   * determination of forward or reverse strand.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.Position)
      com.google.genomics.v1.PositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.PositionProto.internal_static_google_genomics_v1_Position_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.PositionProto.internal_static_google_genomics_v1_Position_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.Position.class, com.google.genomics.v1.Position.Builder.class);
    }

    // Construct using com.google.genomics.v1.Position.newBuilder()
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

      position_ = 0L;

      reverseStrand_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.PositionProto.internal_static_google_genomics_v1_Position_descriptor;
    }

    public com.google.genomics.v1.Position getDefaultInstanceForType() {
      return com.google.genomics.v1.Position.getDefaultInstance();
    }

    public com.google.genomics.v1.Position build() {
      com.google.genomics.v1.Position result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.Position buildPartial() {
      com.google.genomics.v1.Position result = new com.google.genomics.v1.Position(this);
      result.referenceName_ = referenceName_;
      result.position_ = position_;
      result.reverseStrand_ = reverseStrand_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.Position) {
        return mergeFrom((com.google.genomics.v1.Position)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.Position other) {
      if (other == com.google.genomics.v1.Position.getDefaultInstance()) return this;
      if (!other.getReferenceName().isEmpty()) {
        referenceName_ = other.referenceName_;
        onChanged();
      }
      if (other.getPosition() != 0L) {
        setPosition(other.getPosition());
      }
      if (other.getReverseStrand() != false) {
        setReverseStrand(other.getReverseStrand());
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
      com.google.genomics.v1.Position parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.Position) e.getUnfinishedMessage();
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
     * The name of the reference in whatever reference set is being used.
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
     * The name of the reference in whatever reference set is being used.
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
     * The name of the reference in whatever reference set is being used.
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
     * The name of the reference in whatever reference set is being used.
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
     * The name of the reference in whatever reference set is being used.
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

    private long position_ ;
    /**
     * <code>optional int64 position = 2;</code>
     *
     * <pre>
     * The 0-based offset from the start of the forward strand for that reference.
     * </pre>
     */
    public long getPosition() {
      return position_;
    }
    /**
     * <code>optional int64 position = 2;</code>
     *
     * <pre>
     * The 0-based offset from the start of the forward strand for that reference.
     * </pre>
     */
    public Builder setPosition(long value) {
      
      position_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 position = 2;</code>
     *
     * <pre>
     * The 0-based offset from the start of the forward strand for that reference.
     * </pre>
     */
    public Builder clearPosition() {
      
      position_ = 0L;
      onChanged();
      return this;
    }

    private boolean reverseStrand_ ;
    /**
     * <code>optional bool reverse_strand = 3;</code>
     *
     * <pre>
     * Whether this position is on the reverse strand, as opposed to the forward
     * strand.
     * </pre>
     */
    public boolean getReverseStrand() {
      return reverseStrand_;
    }
    /**
     * <code>optional bool reverse_strand = 3;</code>
     *
     * <pre>
     * Whether this position is on the reverse strand, as opposed to the forward
     * strand.
     * </pre>
     */
    public Builder setReverseStrand(boolean value) {
      
      reverseStrand_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool reverse_strand = 3;</code>
     *
     * <pre>
     * Whether this position is on the reverse strand, as opposed to the forward
     * strand.
     * </pre>
     */
    public Builder clearReverseStrand() {
      
      reverseStrand_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.Position)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.Position)
  private static final com.google.genomics.v1.Position defaultInstance;static {
    defaultInstance = new com.google.genomics.v1.Position();
  }

  public static com.google.genomics.v1.Position getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.genomics.v1.Position getDefaultInstanceForType() {
    return defaultInstance;
  }

}
