// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: memory_message.proto

package com.example.project.protobuf.pb;

public interface MemoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:example.protobuf.Memory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 value = 1;</code>
   * @return The value.
   */
  long getValue();

  /**
   * <code>.example.protobuf.Memory.Unit unit = 2;</code>
   * @return The enum numeric value on the wire for unit.
   */
  int getUnitValue();
  /**
   * <code>.example.protobuf.Memory.Unit unit = 2;</code>
   * @return The unit.
   */
  com.example.project.protobuf.pb.Memory.Unit getUnit();
}
