// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.6
// source: backend_nvme_tcp.proto

package _go

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// NvmeRemoteControllerServiceClient is the client API for NvmeRemoteControllerService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type NvmeRemoteControllerServiceClient interface {
	CreateNvmeRemoteController(ctx context.Context, in *CreateNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*NvmeRemoteController, error)
	DeleteNvmeRemoteController(ctx context.Context, in *DeleteNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	UpdateNvmeRemoteController(ctx context.Context, in *UpdateNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*NvmeRemoteController, error)
	ListNvmeRemoteControllers(ctx context.Context, in *ListNvmeRemoteControllersRequest, opts ...grpc.CallOption) (*ListNvmeRemoteControllersResponse, error)
	GetNvmeRemoteController(ctx context.Context, in *GetNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*NvmeRemoteController, error)
	ResetNvmeRemoteController(ctx context.Context, in *ResetNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	StatsNvmeRemoteController(ctx context.Context, in *StatsNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*StatsNvmeRemoteControllerResponse, error)
	ListNvmeRemoteNamespaces(ctx context.Context, in *ListNvmeRemoteNamespacesRequest, opts ...grpc.CallOption) (*ListNvmeRemoteNamespacesResponse, error)
	CreateNvmePath(ctx context.Context, in *CreateNvmePathRequest, opts ...grpc.CallOption) (*NvmePath, error)
	DeleteNvmePath(ctx context.Context, in *DeleteNvmePathRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	UpdateNvmePath(ctx context.Context, in *UpdateNvmePathRequest, opts ...grpc.CallOption) (*NvmePath, error)
	ListNvmePaths(ctx context.Context, in *ListNvmePathsRequest, opts ...grpc.CallOption) (*ListNvmePathsResponse, error)
	GetNvmePath(ctx context.Context, in *GetNvmePathRequest, opts ...grpc.CallOption) (*NvmePath, error)
	StatsNvmePath(ctx context.Context, in *StatsNvmePathRequest, opts ...grpc.CallOption) (*StatsNvmePathResponse, error)
}

type nvmeRemoteControllerServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewNvmeRemoteControllerServiceClient(cc grpc.ClientConnInterface) NvmeRemoteControllerServiceClient {
	return &nvmeRemoteControllerServiceClient{cc}
}

func (c *nvmeRemoteControllerServiceClient) CreateNvmeRemoteController(ctx context.Context, in *CreateNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*NvmeRemoteController, error) {
	out := new(NvmeRemoteController)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/CreateNvmeRemoteController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) DeleteNvmeRemoteController(ctx context.Context, in *DeleteNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/DeleteNvmeRemoteController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) UpdateNvmeRemoteController(ctx context.Context, in *UpdateNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*NvmeRemoteController, error) {
	out := new(NvmeRemoteController)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/UpdateNvmeRemoteController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) ListNvmeRemoteControllers(ctx context.Context, in *ListNvmeRemoteControllersRequest, opts ...grpc.CallOption) (*ListNvmeRemoteControllersResponse, error) {
	out := new(ListNvmeRemoteControllersResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmeRemoteControllers", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) GetNvmeRemoteController(ctx context.Context, in *GetNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*NvmeRemoteController, error) {
	out := new(NvmeRemoteController)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/GetNvmeRemoteController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) ResetNvmeRemoteController(ctx context.Context, in *ResetNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/ResetNvmeRemoteController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) StatsNvmeRemoteController(ctx context.Context, in *StatsNvmeRemoteControllerRequest, opts ...grpc.CallOption) (*StatsNvmeRemoteControllerResponse, error) {
	out := new(StatsNvmeRemoteControllerResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/StatsNvmeRemoteController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) ListNvmeRemoteNamespaces(ctx context.Context, in *ListNvmeRemoteNamespacesRequest, opts ...grpc.CallOption) (*ListNvmeRemoteNamespacesResponse, error) {
	out := new(ListNvmeRemoteNamespacesResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmeRemoteNamespaces", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) CreateNvmePath(ctx context.Context, in *CreateNvmePathRequest, opts ...grpc.CallOption) (*NvmePath, error) {
	out := new(NvmePath)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/CreateNvmePath", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) DeleteNvmePath(ctx context.Context, in *DeleteNvmePathRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/DeleteNvmePath", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) UpdateNvmePath(ctx context.Context, in *UpdateNvmePathRequest, opts ...grpc.CallOption) (*NvmePath, error) {
	out := new(NvmePath)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/UpdateNvmePath", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) ListNvmePaths(ctx context.Context, in *ListNvmePathsRequest, opts ...grpc.CallOption) (*ListNvmePathsResponse, error) {
	out := new(ListNvmePathsResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmePaths", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) GetNvmePath(ctx context.Context, in *GetNvmePathRequest, opts ...grpc.CallOption) (*NvmePath, error) {
	out := new(NvmePath)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/GetNvmePath", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *nvmeRemoteControllerServiceClient) StatsNvmePath(ctx context.Context, in *StatsNvmePathRequest, opts ...grpc.CallOption) (*StatsNvmePathResponse, error) {
	out := new(StatsNvmePathResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.NvmeRemoteControllerService/StatsNvmePath", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// NvmeRemoteControllerServiceServer is the server API for NvmeRemoteControllerService service.
// All implementations should embed UnimplementedNvmeRemoteControllerServiceServer
// for forward compatibility
type NvmeRemoteControllerServiceServer interface {
	CreateNvmeRemoteController(context.Context, *CreateNvmeRemoteControllerRequest) (*NvmeRemoteController, error)
	DeleteNvmeRemoteController(context.Context, *DeleteNvmeRemoteControllerRequest) (*emptypb.Empty, error)
	UpdateNvmeRemoteController(context.Context, *UpdateNvmeRemoteControllerRequest) (*NvmeRemoteController, error)
	ListNvmeRemoteControllers(context.Context, *ListNvmeRemoteControllersRequest) (*ListNvmeRemoteControllersResponse, error)
	GetNvmeRemoteController(context.Context, *GetNvmeRemoteControllerRequest) (*NvmeRemoteController, error)
	ResetNvmeRemoteController(context.Context, *ResetNvmeRemoteControllerRequest) (*emptypb.Empty, error)
	StatsNvmeRemoteController(context.Context, *StatsNvmeRemoteControllerRequest) (*StatsNvmeRemoteControllerResponse, error)
	ListNvmeRemoteNamespaces(context.Context, *ListNvmeRemoteNamespacesRequest) (*ListNvmeRemoteNamespacesResponse, error)
	CreateNvmePath(context.Context, *CreateNvmePathRequest) (*NvmePath, error)
	DeleteNvmePath(context.Context, *DeleteNvmePathRequest) (*emptypb.Empty, error)
	UpdateNvmePath(context.Context, *UpdateNvmePathRequest) (*NvmePath, error)
	ListNvmePaths(context.Context, *ListNvmePathsRequest) (*ListNvmePathsResponse, error)
	GetNvmePath(context.Context, *GetNvmePathRequest) (*NvmePath, error)
	StatsNvmePath(context.Context, *StatsNvmePathRequest) (*StatsNvmePathResponse, error)
}

// UnimplementedNvmeRemoteControllerServiceServer should be embedded to have forward compatible implementations.
type UnimplementedNvmeRemoteControllerServiceServer struct {
}

func (UnimplementedNvmeRemoteControllerServiceServer) CreateNvmeRemoteController(context.Context, *CreateNvmeRemoteControllerRequest) (*NvmeRemoteController, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateNvmeRemoteController not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) DeleteNvmeRemoteController(context.Context, *DeleteNvmeRemoteControllerRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteNvmeRemoteController not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) UpdateNvmeRemoteController(context.Context, *UpdateNvmeRemoteControllerRequest) (*NvmeRemoteController, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateNvmeRemoteController not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) ListNvmeRemoteControllers(context.Context, *ListNvmeRemoteControllersRequest) (*ListNvmeRemoteControllersResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListNvmeRemoteControllers not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) GetNvmeRemoteController(context.Context, *GetNvmeRemoteControllerRequest) (*NvmeRemoteController, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetNvmeRemoteController not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) ResetNvmeRemoteController(context.Context, *ResetNvmeRemoteControllerRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ResetNvmeRemoteController not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) StatsNvmeRemoteController(context.Context, *StatsNvmeRemoteControllerRequest) (*StatsNvmeRemoteControllerResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StatsNvmeRemoteController not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) ListNvmeRemoteNamespaces(context.Context, *ListNvmeRemoteNamespacesRequest) (*ListNvmeRemoteNamespacesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListNvmeRemoteNamespaces not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) CreateNvmePath(context.Context, *CreateNvmePathRequest) (*NvmePath, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateNvmePath not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) DeleteNvmePath(context.Context, *DeleteNvmePathRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteNvmePath not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) UpdateNvmePath(context.Context, *UpdateNvmePathRequest) (*NvmePath, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateNvmePath not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) ListNvmePaths(context.Context, *ListNvmePathsRequest) (*ListNvmePathsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListNvmePaths not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) GetNvmePath(context.Context, *GetNvmePathRequest) (*NvmePath, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetNvmePath not implemented")
}
func (UnimplementedNvmeRemoteControllerServiceServer) StatsNvmePath(context.Context, *StatsNvmePathRequest) (*StatsNvmePathResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StatsNvmePath not implemented")
}

// UnsafeNvmeRemoteControllerServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to NvmeRemoteControllerServiceServer will
// result in compilation errors.
type UnsafeNvmeRemoteControllerServiceServer interface {
	mustEmbedUnimplementedNvmeRemoteControllerServiceServer()
}

func RegisterNvmeRemoteControllerServiceServer(s grpc.ServiceRegistrar, srv NvmeRemoteControllerServiceServer) {
	s.RegisterService(&NvmeRemoteControllerService_ServiceDesc, srv)
}

func _NvmeRemoteControllerService_CreateNvmeRemoteController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateNvmeRemoteControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).CreateNvmeRemoteController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/CreateNvmeRemoteController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).CreateNvmeRemoteController(ctx, req.(*CreateNvmeRemoteControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_DeleteNvmeRemoteController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteNvmeRemoteControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).DeleteNvmeRemoteController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/DeleteNvmeRemoteController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).DeleteNvmeRemoteController(ctx, req.(*DeleteNvmeRemoteControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_UpdateNvmeRemoteController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateNvmeRemoteControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).UpdateNvmeRemoteController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/UpdateNvmeRemoteController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).UpdateNvmeRemoteController(ctx, req.(*UpdateNvmeRemoteControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_ListNvmeRemoteControllers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListNvmeRemoteControllersRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).ListNvmeRemoteControllers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmeRemoteControllers",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).ListNvmeRemoteControllers(ctx, req.(*ListNvmeRemoteControllersRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_GetNvmeRemoteController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetNvmeRemoteControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).GetNvmeRemoteController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/GetNvmeRemoteController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).GetNvmeRemoteController(ctx, req.(*GetNvmeRemoteControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_ResetNvmeRemoteController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ResetNvmeRemoteControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).ResetNvmeRemoteController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/ResetNvmeRemoteController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).ResetNvmeRemoteController(ctx, req.(*ResetNvmeRemoteControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_StatsNvmeRemoteController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StatsNvmeRemoteControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).StatsNvmeRemoteController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/StatsNvmeRemoteController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).StatsNvmeRemoteController(ctx, req.(*StatsNvmeRemoteControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_ListNvmeRemoteNamespaces_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListNvmeRemoteNamespacesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).ListNvmeRemoteNamespaces(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmeRemoteNamespaces",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).ListNvmeRemoteNamespaces(ctx, req.(*ListNvmeRemoteNamespacesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_CreateNvmePath_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateNvmePathRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).CreateNvmePath(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/CreateNvmePath",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).CreateNvmePath(ctx, req.(*CreateNvmePathRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_DeleteNvmePath_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteNvmePathRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).DeleteNvmePath(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/DeleteNvmePath",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).DeleteNvmePath(ctx, req.(*DeleteNvmePathRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_UpdateNvmePath_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateNvmePathRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).UpdateNvmePath(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/UpdateNvmePath",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).UpdateNvmePath(ctx, req.(*UpdateNvmePathRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_ListNvmePaths_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListNvmePathsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).ListNvmePaths(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/ListNvmePaths",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).ListNvmePaths(ctx, req.(*ListNvmePathsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_GetNvmePath_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetNvmePathRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).GetNvmePath(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/GetNvmePath",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).GetNvmePath(ctx, req.(*GetNvmePathRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NvmeRemoteControllerService_StatsNvmePath_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StatsNvmePathRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NvmeRemoteControllerServiceServer).StatsNvmePath(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.NvmeRemoteControllerService/StatsNvmePath",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NvmeRemoteControllerServiceServer).StatsNvmePath(ctx, req.(*StatsNvmePathRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// NvmeRemoteControllerService_ServiceDesc is the grpc.ServiceDesc for NvmeRemoteControllerService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var NvmeRemoteControllerService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "opi_api.storage.v1.NvmeRemoteControllerService",
	HandlerType: (*NvmeRemoteControllerServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateNvmeRemoteController",
			Handler:    _NvmeRemoteControllerService_CreateNvmeRemoteController_Handler,
		},
		{
			MethodName: "DeleteNvmeRemoteController",
			Handler:    _NvmeRemoteControllerService_DeleteNvmeRemoteController_Handler,
		},
		{
			MethodName: "UpdateNvmeRemoteController",
			Handler:    _NvmeRemoteControllerService_UpdateNvmeRemoteController_Handler,
		},
		{
			MethodName: "ListNvmeRemoteControllers",
			Handler:    _NvmeRemoteControllerService_ListNvmeRemoteControllers_Handler,
		},
		{
			MethodName: "GetNvmeRemoteController",
			Handler:    _NvmeRemoteControllerService_GetNvmeRemoteController_Handler,
		},
		{
			MethodName: "ResetNvmeRemoteController",
			Handler:    _NvmeRemoteControllerService_ResetNvmeRemoteController_Handler,
		},
		{
			MethodName: "StatsNvmeRemoteController",
			Handler:    _NvmeRemoteControllerService_StatsNvmeRemoteController_Handler,
		},
		{
			MethodName: "ListNvmeRemoteNamespaces",
			Handler:    _NvmeRemoteControllerService_ListNvmeRemoteNamespaces_Handler,
		},
		{
			MethodName: "CreateNvmePath",
			Handler:    _NvmeRemoteControllerService_CreateNvmePath_Handler,
		},
		{
			MethodName: "DeleteNvmePath",
			Handler:    _NvmeRemoteControllerService_DeleteNvmePath_Handler,
		},
		{
			MethodName: "UpdateNvmePath",
			Handler:    _NvmeRemoteControllerService_UpdateNvmePath_Handler,
		},
		{
			MethodName: "ListNvmePaths",
			Handler:    _NvmeRemoteControllerService_ListNvmePaths_Handler,
		},
		{
			MethodName: "GetNvmePath",
			Handler:    _NvmeRemoteControllerService_GetNvmePath_Handler,
		},
		{
			MethodName: "StatsNvmePath",
			Handler:    _NvmeRemoteControllerService_StatsNvmePath_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "backend_nvme_tcp.proto",
}