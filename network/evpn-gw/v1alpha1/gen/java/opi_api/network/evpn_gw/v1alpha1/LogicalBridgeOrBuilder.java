// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface LogicalBridgeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.LogicalBridge)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Logical Bridge.
   * "name" is an opaque object handle that is not user settable.
   * "name" will be returned with created object
   * user can only set {resource}_id on the Create request object
   * Format: logicalBridges/{logical_bridge}
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the Logical Bridge.
   * "name" is an opaque object handle that is not user settable.
   * "name" will be returned with created object
   * user can only set {resource}_id on the Create request object
   * Format: logicalBridges/{logical_bridge}
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Logical Bridge network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * Logical Bridge network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The spec.
   */
  opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec getSpec();
  /**
   * <pre>
   * Logical Bridge network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.evpn_gw.v1alpha1.LogicalBridgeSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * Logical Bridge network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeStatus status = 3;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Logical Bridge network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeStatus status = 3;</code>
   * @return The status.
   */
  opi_api.network.evpn_gw.v1alpha1.LogicalBridgeStatus getStatus();
  /**
   * <pre>
   * Logical Bridge network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.LogicalBridgeStatus status = 3;</code>
   */
  opi_api.network.evpn_gw.v1alpha1.LogicalBridgeStatusOrBuilder getStatusOrBuilder();
}