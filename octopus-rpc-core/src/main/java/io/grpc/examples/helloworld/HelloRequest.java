// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package io.grpc.examples.helloworld;

/**
 * Protobuf type {@code helloworld.HelloRequest}
 *
 * <pre>
 * The request message containing the user's name.
 * </pre>
 */
public  final class HelloRequest extends
        com.google.protobuf.GeneratedMessage implements
        // @@protoc_insertion_point(message_implements:helloworld.HelloRequest)
        HelloRequestOrBuilder {
    // Use HelloRequest.newBuilder() to construct.
    private HelloRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
    }
    private HelloRequest() {
        name_ = "";
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private HelloRequest(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
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
                        String s = input.readStringRequireUtf8();

                        name_ = s;
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
            throw new RuntimeException(
                    new com.google.protobuf.InvalidProtocolBufferException(
                            e.getMessage()).setUnfinishedMessage(this));
        } finally {
            makeExtensionsImmutable();
        }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_HelloRequest_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_HelloRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        HelloRequest.class, Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile Object name_;
    /**
     * <code>optional string name = 1;</code>
     */
    public String getName() {
        Object ref = name_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            name_ = s;
            return s;
        }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
    getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            name_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
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
        if (!getNameBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getNameBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
        }
        memoizedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;
    public static HelloRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static HelloRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HelloRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }
    public static HelloRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HelloRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static HelloRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HelloRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
    }
    public static HelloRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HelloRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return PARSER.parseFrom(input);
    }
    public static HelloRequest parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(HelloRequest prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
            BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }
    /**
     * Protobuf type {@code helloworld.HelloRequest}
     *
     * <pre>
     * The request message containing the user's name.
     * </pre>
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessage.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:helloworld.HelloRequest)
            io.grpc.examples.helloworld.HelloRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_HelloRequest_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_HelloRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            HelloRequest.class, Builder.class);
        }

        // Construct using io.grpc.examples.helloworld.HelloRequest.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
            }
        }
        public Builder clear() {
            super.clear();
            name_ = "";

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return io.grpc.examples.helloworld.HelloWorldProto.internal_static_helloworld_HelloRequest_descriptor;
        }

        public HelloRequest getDefaultInstanceForType() {
            return HelloRequest.getDefaultInstance();
        }

        public HelloRequest build() {
            HelloRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public HelloRequest buildPartial() {
            HelloRequest result = new HelloRequest(this);
            result.name_ = name_;
            onBuilt();
            return result;
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof HelloRequest) {
                return mergeFrom((HelloRequest)other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(HelloRequest other) {
            if (other == HelloRequest.getDefaultInstance()) return this;
            if (!other.getName().isEmpty()) {
                name_ = other.name_;
                onChanged();
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
            HelloRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (HelloRequest) e.getUnfinishedMessage();
                throw e;
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private Object name_ = "";
        /**
         * <code>optional string name = 1;</code>
         */
        public String getName() {
            Object ref = name_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                name_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }
        /**
         * <code>optional string name = 1;</code>
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            Object ref = name_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        /**
         * <code>optional string name = 1;</code>
         */
        public Builder setName(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            name_ = value;
            onChanged();
            return this;
        }
        /**
         * <code>optional string name = 1;</code>
         */
        public Builder clearName() {

            name_ = getDefaultInstance().getName();
            onChanged();
            return this;
        }
        /**
         * <code>optional string name = 1;</code>
         */
        public Builder setNameBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            name_ = value;
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


        // @@protoc_insertion_point(builder_scope:helloworld.HelloRequest)
    }

    // @@protoc_insertion_point(class_scope:helloworld.HelloRequest)
    private static final HelloRequest DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE = new HelloRequest();
    }

    public static HelloRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HelloRequest>
            PARSER = new com.google.protobuf.AbstractParser<HelloRequest>() {
        public HelloRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            try {
                return new HelloRequest(input, extensionRegistry);
            } catch (RuntimeException e) {
                if (e.getCause() instanceof
                        com.google.protobuf.InvalidProtocolBufferException) {
                    throw (com.google.protobuf.InvalidProtocolBufferException)
                            e.getCause();
                }
                throw e;
            }
        }
    };

    public static com.google.protobuf.Parser<HelloRequest> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<HelloRequest> getParserForType() {
        return PARSER;
    }

    public HelloRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
