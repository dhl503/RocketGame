// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PbTest.proto

package org.example.myrocket.proto.bean;

public final class PbDemoxx {
  private PbDemoxx() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CmdRank}
   */
  public enum CmdRank
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * 个人排行榜
     * </pre>
     *
     * <code>RankInfo = 0;</code>
     */
    RankInfo(0),
    /**
     * <pre>
     * 排行榜简单显示
     * </pre>
     *
     * <code>RankEasyShow = 1;</code>
     */
    RankEasyShow(1),
    /**
     * <pre>
     * 排行榜简单显示
     * </pre>
     *
     * <code>RankAllianceEasyShow = 2;</code>
     */
    RankAllianceEasyShow(2),
    /**
     * <pre>
     *跨服排行榜
     * </pre>
     *
     * <code>RankGlobalInfo = 3;</code>
     */
    RankGlobalInfo(3),
    /**
     * <pre>
     * 跨服排行榜简单显示
     * </pre>
     *
     * <code>RankGlobalEasyShow = 4;</code>
     */
    RankGlobalEasyShow(4),
    /**
     * <pre>
     * 跨服排行榜简单显示
     * </pre>
     *
     * <code>RankGlobalAllianceEasyShow = 5;</code>
     */
    RankGlobalAllianceEasyShow(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * 个人排行榜
     * </pre>
     *
     * <code>RankInfo = 0;</code>
     */
    public static final int RankInfo_VALUE = 0;
    /**
     * <pre>
     * 排行榜简单显示
     * </pre>
     *
     * <code>RankEasyShow = 1;</code>
     */
    public static final int RankEasyShow_VALUE = 1;
    /**
     * <pre>
     * 排行榜简单显示
     * </pre>
     *
     * <code>RankAllianceEasyShow = 2;</code>
     */
    public static final int RankAllianceEasyShow_VALUE = 2;
    /**
     * <pre>
     *跨服排行榜
     * </pre>
     *
     * <code>RankGlobalInfo = 3;</code>
     */
    public static final int RankGlobalInfo_VALUE = 3;
    /**
     * <pre>
     * 跨服排行榜简单显示
     * </pre>
     *
     * <code>RankGlobalEasyShow = 4;</code>
     */
    public static final int RankGlobalEasyShow_VALUE = 4;
    /**
     * <pre>
     * 跨服排行榜简单显示
     * </pre>
     *
     * <code>RankGlobalAllianceEasyShow = 5;</code>
     */
    public static final int RankGlobalAllianceEasyShow_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CmdRank valueOf(int value) {
      return forNumber(value);
    }

    public static CmdRank forNumber(int value) {
      switch (value) {
        case 0: return RankInfo;
        case 1: return RankEasyShow;
        case 2: return RankAllianceEasyShow;
        case 3: return RankGlobalInfo;
        case 4: return RankGlobalEasyShow;
        case 5: return RankGlobalAllianceEasyShow;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CmdRank>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CmdRank> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CmdRank>() {
            public CmdRank findValueByNumber(int number) {
              return CmdRank.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.example.myrocket.proto.bean.PbDemoxx.getDescriptor().getEnumTypes().get(0);
    }

    private static final CmdRank[] VALUES = values();

    public static CmdRank valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CmdRank(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CmdRank)
  }

  public interface MsgReqRankInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MsgReqRankInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 rankType = 1;</code>
     */
    int getRankType();

    /**
     * <pre>
     * 页数
     * </pre>
     *
     * <code>int32 page = 2;</code>
     */
    int getPage();
  }
  /**
   * <pre>
   * 个人战力排行榜
   * </pre>
   *
   * Protobuf type {@code MsgReqRankInfo}
   */
  public  static final class MsgReqRankInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MsgReqRankInfo)
      MsgReqRankInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MsgReqRankInfo.newBuilder() to construct.
    private MsgReqRankInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MsgReqRankInfo() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MsgReqRankInfo(
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
            case 8: {

              rankType_ = input.readInt32();
              break;
            }
            case 16: {

              page_ = input.readInt32();
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
      return org.example.myrocket.proto.bean.PbDemoxx.internal_static_MsgReqRankInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.myrocket.proto.bean.PbDemoxx.internal_static_MsgReqRankInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo.class, org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo.Builder.class);
    }

    public static final int RANKTYPE_FIELD_NUMBER = 1;
    private int rankType_;
    /**
     * <code>int32 rankType = 1;</code>
     */
    public int getRankType() {
      return rankType_;
    }

    public static final int PAGE_FIELD_NUMBER = 2;
    private int page_;
    /**
     * <pre>
     * 页数
     * </pre>
     *
     * <code>int32 page = 2;</code>
     */
    public int getPage() {
      return page_;
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
      if (rankType_ != 0) {
        output.writeInt32(1, rankType_);
      }
      if (page_ != 0) {
        output.writeInt32(2, page_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rankType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, rankType_);
      }
      if (page_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, page_);
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
      if (!(obj instanceof org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo)) {
        return super.equals(obj);
      }
      org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo other = (org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo) obj;

      if (getRankType()
          != other.getRankType()) return false;
      if (getPage()
          != other.getPage()) return false;
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
      hash = (37 * hash) + RANKTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRankType();
      hash = (37 * hash) + PAGE_FIELD_NUMBER;
      hash = (53 * hash) + getPage();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parseFrom(
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
    public static Builder newBuilder(org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo prototype) {
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
     * 个人战力排行榜
     * </pre>
     *
     * Protobuf type {@code MsgReqRankInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MsgReqRankInfo)
        org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.example.myrocket.proto.bean.PbDemoxx.internal_static_MsgReqRankInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.example.myrocket.proto.bean.PbDemoxx.internal_static_MsgReqRankInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo.class, org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo.Builder.class);
      }

      // Construct using org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo.newBuilder()
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
        rankType_ = 0;

        page_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.example.myrocket.proto.bean.PbDemoxx.internal_static_MsgReqRankInfo_descriptor;
      }

      @java.lang.Override
      public org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo getDefaultInstanceForType() {
        return org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo.getDefaultInstance();
      }

      @java.lang.Override
      public org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo build() {
        org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo buildPartial() {
        org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo result = new org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo(this);
        result.rankType_ = rankType_;
        result.page_ = page_;
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
        if (other instanceof org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo) {
          return mergeFrom((org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo other) {
        if (other == org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo.getDefaultInstance()) return this;
        if (other.getRankType() != 0) {
          setRankType(other.getRankType());
        }
        if (other.getPage() != 0) {
          setPage(other.getPage());
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
        org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rankType_ ;
      /**
       * <code>int32 rankType = 1;</code>
       */
      public int getRankType() {
        return rankType_;
      }
      /**
       * <code>int32 rankType = 1;</code>
       */
      public Builder setRankType(int value) {
        
        rankType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 rankType = 1;</code>
       */
      public Builder clearRankType() {
        
        rankType_ = 0;
        onChanged();
        return this;
      }

      private int page_ ;
      /**
       * <pre>
       * 页数
       * </pre>
       *
       * <code>int32 page = 2;</code>
       */
      public int getPage() {
        return page_;
      }
      /**
       * <pre>
       * 页数
       * </pre>
       *
       * <code>int32 page = 2;</code>
       */
      public Builder setPage(int value) {
        
        page_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 页数
       * </pre>
       *
       * <code>int32 page = 2;</code>
       */
      public Builder clearPage() {
        
        page_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MsgReqRankInfo)
    }

    // @@protoc_insertion_point(class_scope:MsgReqRankInfo)
    private static final org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo();
    }

    public static org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MsgReqRankInfo>
        PARSER = new com.google.protobuf.AbstractParser<MsgReqRankInfo>() {
      @java.lang.Override
      public MsgReqRankInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MsgReqRankInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MsgReqRankInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MsgReqRankInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.example.myrocket.proto.bean.PbDemoxx.MsgReqRankInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MsgReqRankInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MsgReqRankInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014PbTest.proto\"0\n\016MsgReqRankInfo\022\020\n\010rank" +
      "Type\030\001 \001(\005\022\014\n\004page\030\002 \001(\005*\217\001\n\007CmdRank\022\014\n\010" +
      "RankInfo\020\000\022\020\n\014RankEasyShow\020\001\022\030\n\024RankAlli" +
      "anceEasyShow\020\002\022\022\n\016RankGlobalInfo\020\003\022\026\n\022Ra" +
      "nkGlobalEasyShow\020\004\022\036\n\032RankGlobalAlliance" +
      "EasyShow\020\005B+\n\037org.example.myrocket.proto" +
      ".beanB\010PbDemoxxb\006proto3"
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
    internal_static_MsgReqRankInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MsgReqRankInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MsgReqRankInfo_descriptor,
        new java.lang.String[] { "RankType", "Page", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
