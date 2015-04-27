// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Vec3f.proto

package protobuf;

public final class Vec3fProtos {
  private Vec3fProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Vec3fOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional float x = 1;
    boolean hasX();
    float getX();
    
    // optional float y = 2;
    boolean hasY();
    float getY();
    
    // optional float z = 3;
    boolean hasZ();
    float getZ();
  }
  public static final class Vec3f extends
      com.google.protobuf.GeneratedMessage
      implements Vec3fOrBuilder {
    // Use Vec3f.newBuilder() to construct.
    private Vec3f(Builder builder) {
      super(builder);
    }
    private Vec3f(boolean noInit) {}
    
    private static final Vec3f defaultInstance;
    public static Vec3f getDefaultInstance() {
      return defaultInstance;
    }
    
    public Vec3f getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.Vec3fProtos.internal_static_protobuf_Vec3f_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.Vec3fProtos.internal_static_protobuf_Vec3f_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional float x = 1;
    public static final int X_FIELD_NUMBER = 1;
    private float x_;
    public boolean hasX() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public float getX() {
      return x_;
    }
    
    // optional float y = 2;
    public static final int Y_FIELD_NUMBER = 2;
    private float y_;
    public boolean hasY() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public float getY() {
      return y_;
    }
    
    // optional float z = 3;
    public static final int Z_FIELD_NUMBER = 3;
    private float z_;
    public boolean hasZ() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public float getZ() {
      return z_;
    }
    
    private void initFields() {
      x_ = 0F;
      y_ = 0F;
      z_ = 0F;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeFloat(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(2, y_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeFloat(3, z_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, y_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, z_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static protobuf.Vec3fProtos.Vec3f parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static protobuf.Vec3fProtos.Vec3f parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static protobuf.Vec3fProtos.Vec3f parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static protobuf.Vec3fProtos.Vec3f parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static protobuf.Vec3fProtos.Vec3f parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static protobuf.Vec3fProtos.Vec3f parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static protobuf.Vec3fProtos.Vec3f parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static protobuf.Vec3fProtos.Vec3f parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static protobuf.Vec3fProtos.Vec3f parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static protobuf.Vec3fProtos.Vec3f parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(protobuf.Vec3fProtos.Vec3f prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements protobuf.Vec3fProtos.Vec3fOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf.Vec3fProtos.internal_static_protobuf_Vec3f_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf.Vec3fProtos.internal_static_protobuf_Vec3f_fieldAccessorTable;
      }
      
      // Construct using protobuf.Vec3fProtos.Vec3f.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        x_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000001);
        y_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        z_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf.Vec3fProtos.Vec3f.getDescriptor();
      }
      
      public protobuf.Vec3fProtos.Vec3f getDefaultInstanceForType() {
        return protobuf.Vec3fProtos.Vec3f.getDefaultInstance();
      }
      
      public protobuf.Vec3fProtos.Vec3f build() {
        protobuf.Vec3fProtos.Vec3f result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private protobuf.Vec3fProtos.Vec3f buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        protobuf.Vec3fProtos.Vec3f result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public protobuf.Vec3fProtos.Vec3f buildPartial() {
        protobuf.Vec3fProtos.Vec3f result = new protobuf.Vec3fProtos.Vec3f(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.y_ = y_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.z_ = z_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protobuf.Vec3fProtos.Vec3f) {
          return mergeFrom((protobuf.Vec3fProtos.Vec3f)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(protobuf.Vec3fProtos.Vec3f other) {
        if (other == protobuf.Vec3fProtos.Vec3f.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        if (other.hasZ()) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 13: {
              bitField0_ |= 0x00000001;
              x_ = input.readFloat();
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              y_ = input.readFloat();
              break;
            }
            case 29: {
              bitField0_ |= 0x00000004;
              z_ = input.readFloat();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional float x = 1;
      private float x_ ;
      public boolean hasX() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public float getX() {
        return x_;
      }
      public Builder setX(float value) {
        bitField0_ |= 0x00000001;
        x_ = value;
        onChanged();
        return this;
      }
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0F;
        onChanged();
        return this;
      }
      
      // optional float y = 2;
      private float y_ ;
      public boolean hasY() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public float getY() {
        return y_;
      }
      public Builder setY(float value) {
        bitField0_ |= 0x00000002;
        y_ = value;
        onChanged();
        return this;
      }
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0F;
        onChanged();
        return this;
      }
      
      // optional float z = 3;
      private float z_ ;
      public boolean hasZ() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public float getZ() {
        return z_;
      }
      public Builder setZ(float value) {
        bitField0_ |= 0x00000004;
        z_ = value;
        onChanged();
        return this;
      }
      public Builder clearZ() {
        bitField0_ = (bitField0_ & ~0x00000004);
        z_ = 0F;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:protobuf.Vec3f)
    }
    
    static {
      defaultInstance = new Vec3f(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:protobuf.Vec3f)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_Vec3f_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_protobuf_Vec3f_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Vec3f.proto\022\010protobuf\"(\n\005Vec3f\022\t\n\001x\030\001 " +
      "\001(\002\022\t\n\001y\030\002 \001(\002\022\t\n\001z\030\003 \001(\002B\027\n\010protobufB\013V" +
      "ec3fProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_protobuf_Vec3f_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_protobuf_Vec3f_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_protobuf_Vec3f_descriptor,
              new java.lang.String[] { "X", "Y", "Z", },
              protobuf.Vec3fProtos.Vec3f.class,
              protobuf.Vec3fProtos.Vec3f.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
