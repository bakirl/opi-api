// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l2_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface UpdateBridgePortRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.UpdateBridgePortRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 1;</code>
   * @return Whether the bridgePort field is set.
   */
  boolean hasBridgePort();
  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 1;</code>
   * @return The bridgePort.
   */
  opi_api.network.evpn_gw.v1alpha1.BridgePort getBridgePort();
  /**
   * <pre>
   * The object's `name` field is used to identify the object to be updated.
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.BridgePort bridge_port = 1;</code>
   */
  opi_api.network.evpn_gw.v1alpha1.BridgePortOrBuilder getBridgePortOrBuilder();

  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * If set to true, and the object is not found, a new object will be created.
   * In this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
