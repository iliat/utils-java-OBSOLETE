// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.UpdateCallSetRequest}
 */
public  final class UpdateCallSetRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.UpdateCallSetRequest)
    UpdateCallSetRequestOrBuilder {
  // Use UpdateCallSetRequest.newBuilder() to construct.
  private UpdateCallSetRequest(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private UpdateCallSetRequest() {
    callSetId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateCallSetRequest(
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

            callSetId_ = bs;
            break;
          }
          case 18: {
            com.google.genomics.v1.CallSet.Builder subBuilder = null;
            if (callSet_ != null) {
              subBuilder = callSet_.toBuilder();
            }
            callSet_ = input.readMessage(com.google.genomics.v1.CallSet.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(callSet_);
              callSet_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

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
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_UpdateCallSetRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_UpdateCallSetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.UpdateCallSetRequest.class, com.google.genomics.v1.UpdateCallSetRequest.Builder.class);
  }

  public static final com.google.protobuf.Parser<UpdateCallSetRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateCallSetRequest>() {
    public UpdateCallSetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateCallSetRequest(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCallSetRequest> getParserForType() {
    return PARSER;
  }

  public static final int CALL_SET_ID_FIELD_NUMBER = 1;
  private java.lang.Object callSetId_;
  /**
   * <code>optional string call_set_id = 1;</code>
   *
   * <pre>
   * The ID of the call set to be updated.
   * </pre>
   */
  public java.lang.String getCallSetId() {
    java.lang.Object ref = callSetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        callSetId_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string call_set_id = 1;</code>
   *
   * <pre>
   * The ID of the call set to be updated.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getCallSetIdBytes() {
    java.lang.Object ref = callSetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callSetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CALL_SET_FIELD_NUMBER = 2;
  private com.google.genomics.v1.CallSet callSet_;
  /**
   * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
   *
   * <pre>
   * The new call set data.
   * </pre>
   */
  public boolean hasCallSet() {
    return callSet_ != null;
  }
  /**
   * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
   *
   * <pre>
   * The new call set data.
   * </pre>
   */
  public com.google.genomics.v1.CallSet getCallSet() {
    return callSet_ == null ? com.google.genomics.v1.CallSet.getDefaultInstance() : callSet_;
  }
  /**
   * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
   *
   * <pre>
   * The new call set data.
   * </pre>
   */
  public com.google.genomics.v1.CallSetOrBuilder getCallSetOrBuilder() {
    return getCallSet();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
   *
   * <pre>
   * An optional mask which identifies which fields to update. The update
   * will fail if invalid fields are specified. Leave empty to replace
   * the resource in its entirety.
   * </pre>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (!getCallSetIdBytes().isEmpty()) {
      output.writeBytes(1, getCallSetIdBytes());
    }
    if (callSet_ != null) {
      output.writeMessage(2, getCallSet());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCallSetIdBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, getCallSetIdBytes());
    }
    if (callSet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCallSet());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.UpdateCallSetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.UpdateCallSetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateCallSetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.UpdateCallSetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateCallSetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.UpdateCallSetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateCallSetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.UpdateCallSetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.UpdateCallSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.UpdateCallSetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.genomics.v1.UpdateCallSetRequest prototype) {
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
   * Protobuf type {@code google.genomics.v1.UpdateCallSetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.UpdateCallSetRequest)
      com.google.genomics.v1.UpdateCallSetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_UpdateCallSetRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_UpdateCallSetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.UpdateCallSetRequest.class, com.google.genomics.v1.UpdateCallSetRequest.Builder.class);
    }

    // Construct using com.google.genomics.v1.UpdateCallSetRequest.newBuilder()
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
      callSetId_ = "";

      if (callSetBuilder_ == null) {
        callSet_ = null;
      } else {
        callSet_ = null;
        callSetBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.VariantsProto.internal_static_google_genomics_v1_UpdateCallSetRequest_descriptor;
    }

    public com.google.genomics.v1.UpdateCallSetRequest getDefaultInstanceForType() {
      return com.google.genomics.v1.UpdateCallSetRequest.getDefaultInstance();
    }

    public com.google.genomics.v1.UpdateCallSetRequest build() {
      com.google.genomics.v1.UpdateCallSetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.UpdateCallSetRequest buildPartial() {
      com.google.genomics.v1.UpdateCallSetRequest result = new com.google.genomics.v1.UpdateCallSetRequest(this);
      result.callSetId_ = callSetId_;
      if (callSetBuilder_ == null) {
        result.callSet_ = callSet_;
      } else {
        result.callSet_ = callSetBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.UpdateCallSetRequest) {
        return mergeFrom((com.google.genomics.v1.UpdateCallSetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.UpdateCallSetRequest other) {
      if (other == com.google.genomics.v1.UpdateCallSetRequest.getDefaultInstance()) return this;
      if (!other.getCallSetId().isEmpty()) {
        callSetId_ = other.callSetId_;
        onChanged();
      }
      if (other.hasCallSet()) {
        mergeCallSet(other.getCallSet());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.genomics.v1.UpdateCallSetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.UpdateCallSetRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object callSetId_ = "";
    /**
     * <code>optional string call_set_id = 1;</code>
     *
     * <pre>
     * The ID of the call set to be updated.
     * </pre>
     */
    public java.lang.String getCallSetId() {
      java.lang.Object ref = callSetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          callSetId_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string call_set_id = 1;</code>
     *
     * <pre>
     * The ID of the call set to be updated.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getCallSetIdBytes() {
      java.lang.Object ref = callSetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callSetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string call_set_id = 1;</code>
     *
     * <pre>
     * The ID of the call set to be updated.
     * </pre>
     */
    public Builder setCallSetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callSetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string call_set_id = 1;</code>
     *
     * <pre>
     * The ID of the call set to be updated.
     * </pre>
     */
    public Builder clearCallSetId() {
      
      callSetId_ = getDefaultInstance().getCallSetId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string call_set_id = 1;</code>
     *
     * <pre>
     * The ID of the call set to be updated.
     * </pre>
     */
    public Builder setCallSetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callSetId_ = value;
      onChanged();
      return this;
    }

    private com.google.genomics.v1.CallSet callSet_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.genomics.v1.CallSet, com.google.genomics.v1.CallSet.Builder, com.google.genomics.v1.CallSetOrBuilder> callSetBuilder_;
    /**
     * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
     *
     * <pre>
     * The new call set data.
     * </pre>
     */
    public boolean hasCallSet() {
      return callSetBuilder_ != null || callSet_ != null;
    }
    /**
     * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
     *
     * <pre>
     * The new call set data.
     * </pre>
     */
    public com.google.genomics.v1.CallSet getCallSet() {
      if (callSetBuilder_ == null) {
        return callSet_ == null ? com.google.genomics.v1.CallSet.getDefaultInstance() : callSet_;
      } else {
        return callSetBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
     *
     * <pre>
     * The new call set data.
     * </pre>
     */
    public Builder setCallSet(com.google.genomics.v1.CallSet value) {
      if (callSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        callSet_ = value;
        onChanged();
      } else {
        callSetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
     *
     * <pre>
     * The new call set data.
     * </pre>
     */
    public Builder setCallSet(
        com.google.genomics.v1.CallSet.Builder builderForValue) {
      if (callSetBuilder_ == null) {
        callSet_ = builderForValue.build();
        onChanged();
      } else {
        callSetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
     *
     * <pre>
     * The new call set data.
     * </pre>
     */
    public Builder mergeCallSet(com.google.genomics.v1.CallSet value) {
      if (callSetBuilder_ == null) {
        if (callSet_ != null) {
          callSet_ =
            com.google.genomics.v1.CallSet.newBuilder(callSet_).mergeFrom(value).buildPartial();
        } else {
          callSet_ = value;
        }
        onChanged();
      } else {
        callSetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
     *
     * <pre>
     * The new call set data.
     * </pre>
     */
    public Builder clearCallSet() {
      if (callSetBuilder_ == null) {
        callSet_ = null;
        onChanged();
      } else {
        callSet_ = null;
        callSetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
     *
     * <pre>
     * The new call set data.
     * </pre>
     */
    public com.google.genomics.v1.CallSet.Builder getCallSetBuilder() {
      
      onChanged();
      return getCallSetFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
     *
     * <pre>
     * The new call set data.
     * </pre>
     */
    public com.google.genomics.v1.CallSetOrBuilder getCallSetOrBuilder() {
      if (callSetBuilder_ != null) {
        return callSetBuilder_.getMessageOrBuilder();
      } else {
        return callSet_ == null ?
            com.google.genomics.v1.CallSet.getDefaultInstance() : callSet_;
      }
    }
    /**
     * <code>optional .google.genomics.v1.CallSet call_set = 2;</code>
     *
     * <pre>
     * The new call set data.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.genomics.v1.CallSet, com.google.genomics.v1.CallSet.Builder, com.google.genomics.v1.CallSetOrBuilder> 
        getCallSetFieldBuilder() {
      if (callSetBuilder_ == null) {
        callSetBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.genomics.v1.CallSet, com.google.genomics.v1.CallSet.Builder, com.google.genomics.v1.CallSetOrBuilder>(
                getCallSet(),
                getParentForChildren(),
                isClean());
        callSet_ = null;
      }
      return callSetBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <code>optional .google.protobuf.FieldMask update_mask = 3;</code>
     *
     * <pre>
     * An optional mask which identifies which fields to update. The update
     * will fail if invalid fields are specified. Leave empty to replace
     * the resource in its entirety.
     * </pre>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.UpdateCallSetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.UpdateCallSetRequest)
  private static final com.google.genomics.v1.UpdateCallSetRequest defaultInstance;static {
    defaultInstance = new com.google.genomics.v1.UpdateCallSetRequest();
  }

  public static com.google.genomics.v1.UpdateCallSetRequest getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.genomics.v1.UpdateCallSetRequest getDefaultInstanceForType() {
    return defaultInstance;
  }

}

