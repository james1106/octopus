// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package io.grpc.examples.routeguide;

public interface FeatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:routeguide.Feature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The name of the feature.
   * </pre>
   */
  String getName();
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The name of the feature.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional .routeguide.Point location = 2;</code>
   *
   * <pre>
   * The point where the feature is detected.
   * </pre>
   */
  boolean hasLocation();
  /**
   * <code>optional .routeguide.Point location = 2;</code>
   *
   * <pre>
   * The point where the feature is detected.
   * </pre>
   */
  io.grpc.examples.routeguide.Point getLocation();
  /**
   * <code>optional .routeguide.Point location = 2;</code>
   *
   * <pre>
   * The point where the feature is detected.
   * </pre>
   */
  io.grpc.examples.routeguide.PointOrBuilder getLocationOrBuilder();
}
