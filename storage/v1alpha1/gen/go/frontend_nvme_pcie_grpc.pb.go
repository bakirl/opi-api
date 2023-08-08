// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.6
// source: frontend_nvme_pcie.proto

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

// FrontendNvmeServiceClient is the client API for FrontendNvmeService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type FrontendNvmeServiceClient interface {
	CreateNvmeSubsystem(ctx context.Context, in *CreateNvmeSubsystemRequest, opts ...grpc.CallOption) (*NvmeSubsystem, error)
	// Fails if there are any associated objects
	DeleteNvmeSubsystem(ctx context.Context, in *DeleteNvmeSubsystemRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	UpdateNvmeSubsystem(ctx context.Context, in *UpdateNvmeSubsystemRequest, opts ...grpc.CallOption) (*NvmeSubsystem, error)
	ListNvmeSubsystems(ctx context.Context, in *ListNvmeSubsystemsRequest, opts ...grpc.CallOption) (*ListNvmeSubsystemsResponse, error)
	GetNvmeSubsystem(ctx context.Context, in *GetNvmeSubsystemRequest, opts ...grpc.CallOption) (*NvmeSubsystem, error)
	StatsNvmeSubsystem(ctx context.Context, in *StatsNvmeSubsystemRequest, opts ...grpc.CallOption) (*StatsNvmeSubsystemResponse, error)
	CreateNvmeController(ctx context.Context, in *CreateNvmeControllerRequest, opts ...grpc.CallOption) (*NvmeController, error)
	// Fails if there are any associated objects
	DeleteNvmeController(ctx context.Context, in *DeleteNvmeControllerRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	UpdateNvmeController(ctx context.Context, in *UpdateNvmeControllerRequest, opts ...grpc.CallOption) (*NvmeController, error)
	ListNvmeControllers(ctx context.Context, in *ListNvmeControllersRequest, opts ...grpc.CallOption) (*ListNvmeControllersResponse, error)
	GetNvmeController(ctx context.Context, in *GetNvmeControllerRequest, opts ...grpc.CallOption) (*NvmeController, error)
	StatsNvmeController(ctx context.Context, in *StatsNvmeControllerRequest, opts ...grpc.CallOption) (*StatsNvmeControllerResponse, error)
	CreateNvmeNamespace(ctx context.Context, in *CreateNvmeNamespaceRequest, opts ...grpc.CallOption) (*NvmeNamespace, error)
	DeleteNvmeNamespace(ctx context.Context, in *DeleteNvmeNamespaceRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	UpdateNvmeNamespace(ctx context.Context, in *UpdateNvmeNamespaceRequest, opts ...grpc.CallOption) (*NvmeNamespace, error)
	ListNvmeNamespaces(ctx context.Context, in *ListNvmeNamespacesRequest, opts ...grpc.CallOption) (*ListNvmeNamespacesResponse, error)
	GetNvmeNamespace(ctx context.Context, in *GetNvmeNamespaceRequest, opts ...grpc.CallOption) (*NvmeNamespace, error)
	StatsNvmeNamespace(ctx context.Context, in *StatsNvmeNamespaceRequest, opts ...grpc.CallOption) (*StatsNvmeNamespaceResponse, error)
}

type frontendNvmeServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewFrontendNvmeServiceClient(cc grpc.ClientConnInterface) FrontendNvmeServiceClient {
	return &frontendNvmeServiceClient{cc}
}

func (c *frontendNvmeServiceClient) CreateNvmeSubsystem(ctx context.Context, in *CreateNvmeSubsystemRequest, opts ...grpc.CallOption) (*NvmeSubsystem, error) {
	out := new(NvmeSubsystem)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/CreateNvmeSubsystem", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) DeleteNvmeSubsystem(ctx context.Context, in *DeleteNvmeSubsystemRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/DeleteNvmeSubsystem", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) UpdateNvmeSubsystem(ctx context.Context, in *UpdateNvmeSubsystemRequest, opts ...grpc.CallOption) (*NvmeSubsystem, error) {
	out := new(NvmeSubsystem)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/UpdateNvmeSubsystem", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) ListNvmeSubsystems(ctx context.Context, in *ListNvmeSubsystemsRequest, opts ...grpc.CallOption) (*ListNvmeSubsystemsResponse, error) {
	out := new(ListNvmeSubsystemsResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/ListNvmeSubsystems", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) GetNvmeSubsystem(ctx context.Context, in *GetNvmeSubsystemRequest, opts ...grpc.CallOption) (*NvmeSubsystem, error) {
	out := new(NvmeSubsystem)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/GetNvmeSubsystem", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) StatsNvmeSubsystem(ctx context.Context, in *StatsNvmeSubsystemRequest, opts ...grpc.CallOption) (*StatsNvmeSubsystemResponse, error) {
	out := new(StatsNvmeSubsystemResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/StatsNvmeSubsystem", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) CreateNvmeController(ctx context.Context, in *CreateNvmeControllerRequest, opts ...grpc.CallOption) (*NvmeController, error) {
	out := new(NvmeController)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/CreateNvmeController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) DeleteNvmeController(ctx context.Context, in *DeleteNvmeControllerRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/DeleteNvmeController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) UpdateNvmeController(ctx context.Context, in *UpdateNvmeControllerRequest, opts ...grpc.CallOption) (*NvmeController, error) {
	out := new(NvmeController)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/UpdateNvmeController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) ListNvmeControllers(ctx context.Context, in *ListNvmeControllersRequest, opts ...grpc.CallOption) (*ListNvmeControllersResponse, error) {
	out := new(ListNvmeControllersResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/ListNvmeControllers", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) GetNvmeController(ctx context.Context, in *GetNvmeControllerRequest, opts ...grpc.CallOption) (*NvmeController, error) {
	out := new(NvmeController)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/GetNvmeController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) StatsNvmeController(ctx context.Context, in *StatsNvmeControllerRequest, opts ...grpc.CallOption) (*StatsNvmeControllerResponse, error) {
	out := new(StatsNvmeControllerResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/StatsNvmeController", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) CreateNvmeNamespace(ctx context.Context, in *CreateNvmeNamespaceRequest, opts ...grpc.CallOption) (*NvmeNamespace, error) {
	out := new(NvmeNamespace)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/CreateNvmeNamespace", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) DeleteNvmeNamespace(ctx context.Context, in *DeleteNvmeNamespaceRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/DeleteNvmeNamespace", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) UpdateNvmeNamespace(ctx context.Context, in *UpdateNvmeNamespaceRequest, opts ...grpc.CallOption) (*NvmeNamespace, error) {
	out := new(NvmeNamespace)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/UpdateNvmeNamespace", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) ListNvmeNamespaces(ctx context.Context, in *ListNvmeNamespacesRequest, opts ...grpc.CallOption) (*ListNvmeNamespacesResponse, error) {
	out := new(ListNvmeNamespacesResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/ListNvmeNamespaces", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) GetNvmeNamespace(ctx context.Context, in *GetNvmeNamespaceRequest, opts ...grpc.CallOption) (*NvmeNamespace, error) {
	out := new(NvmeNamespace)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/GetNvmeNamespace", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *frontendNvmeServiceClient) StatsNvmeNamespace(ctx context.Context, in *StatsNvmeNamespaceRequest, opts ...grpc.CallOption) (*StatsNvmeNamespaceResponse, error) {
	out := new(StatsNvmeNamespaceResponse)
	err := c.cc.Invoke(ctx, "/opi_api.storage.v1.FrontendNvmeService/StatsNvmeNamespace", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// FrontendNvmeServiceServer is the server API for FrontendNvmeService service.
// All implementations should embed UnimplementedFrontendNvmeServiceServer
// for forward compatibility
type FrontendNvmeServiceServer interface {
	CreateNvmeSubsystem(context.Context, *CreateNvmeSubsystemRequest) (*NvmeSubsystem, error)
	// Fails if there are any associated objects
	DeleteNvmeSubsystem(context.Context, *DeleteNvmeSubsystemRequest) (*emptypb.Empty, error)
	UpdateNvmeSubsystem(context.Context, *UpdateNvmeSubsystemRequest) (*NvmeSubsystem, error)
	ListNvmeSubsystems(context.Context, *ListNvmeSubsystemsRequest) (*ListNvmeSubsystemsResponse, error)
	GetNvmeSubsystem(context.Context, *GetNvmeSubsystemRequest) (*NvmeSubsystem, error)
	StatsNvmeSubsystem(context.Context, *StatsNvmeSubsystemRequest) (*StatsNvmeSubsystemResponse, error)
	CreateNvmeController(context.Context, *CreateNvmeControllerRequest) (*NvmeController, error)
	// Fails if there are any associated objects
	DeleteNvmeController(context.Context, *DeleteNvmeControllerRequest) (*emptypb.Empty, error)
	UpdateNvmeController(context.Context, *UpdateNvmeControllerRequest) (*NvmeController, error)
	ListNvmeControllers(context.Context, *ListNvmeControllersRequest) (*ListNvmeControllersResponse, error)
	GetNvmeController(context.Context, *GetNvmeControllerRequest) (*NvmeController, error)
	StatsNvmeController(context.Context, *StatsNvmeControllerRequest) (*StatsNvmeControllerResponse, error)
	CreateNvmeNamespace(context.Context, *CreateNvmeNamespaceRequest) (*NvmeNamespace, error)
	DeleteNvmeNamespace(context.Context, *DeleteNvmeNamespaceRequest) (*emptypb.Empty, error)
	UpdateNvmeNamespace(context.Context, *UpdateNvmeNamespaceRequest) (*NvmeNamespace, error)
	ListNvmeNamespaces(context.Context, *ListNvmeNamespacesRequest) (*ListNvmeNamespacesResponse, error)
	GetNvmeNamespace(context.Context, *GetNvmeNamespaceRequest) (*NvmeNamespace, error)
	StatsNvmeNamespace(context.Context, *StatsNvmeNamespaceRequest) (*StatsNvmeNamespaceResponse, error)
}

// UnimplementedFrontendNvmeServiceServer should be embedded to have forward compatible implementations.
type UnimplementedFrontendNvmeServiceServer struct {
}

func (UnimplementedFrontendNvmeServiceServer) CreateNvmeSubsystem(context.Context, *CreateNvmeSubsystemRequest) (*NvmeSubsystem, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateNvmeSubsystem not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) DeleteNvmeSubsystem(context.Context, *DeleteNvmeSubsystemRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteNvmeSubsystem not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) UpdateNvmeSubsystem(context.Context, *UpdateNvmeSubsystemRequest) (*NvmeSubsystem, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateNvmeSubsystem not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) ListNvmeSubsystems(context.Context, *ListNvmeSubsystemsRequest) (*ListNvmeSubsystemsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListNvmeSubsystems not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) GetNvmeSubsystem(context.Context, *GetNvmeSubsystemRequest) (*NvmeSubsystem, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetNvmeSubsystem not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) StatsNvmeSubsystem(context.Context, *StatsNvmeSubsystemRequest) (*StatsNvmeSubsystemResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StatsNvmeSubsystem not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) CreateNvmeController(context.Context, *CreateNvmeControllerRequest) (*NvmeController, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateNvmeController not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) DeleteNvmeController(context.Context, *DeleteNvmeControllerRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteNvmeController not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) UpdateNvmeController(context.Context, *UpdateNvmeControllerRequest) (*NvmeController, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateNvmeController not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) ListNvmeControllers(context.Context, *ListNvmeControllersRequest) (*ListNvmeControllersResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListNvmeControllers not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) GetNvmeController(context.Context, *GetNvmeControllerRequest) (*NvmeController, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetNvmeController not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) StatsNvmeController(context.Context, *StatsNvmeControllerRequest) (*StatsNvmeControllerResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StatsNvmeController not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) CreateNvmeNamespace(context.Context, *CreateNvmeNamespaceRequest) (*NvmeNamespace, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateNvmeNamespace not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) DeleteNvmeNamespace(context.Context, *DeleteNvmeNamespaceRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteNvmeNamespace not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) UpdateNvmeNamespace(context.Context, *UpdateNvmeNamespaceRequest) (*NvmeNamespace, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateNvmeNamespace not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) ListNvmeNamespaces(context.Context, *ListNvmeNamespacesRequest) (*ListNvmeNamespacesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListNvmeNamespaces not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) GetNvmeNamespace(context.Context, *GetNvmeNamespaceRequest) (*NvmeNamespace, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetNvmeNamespace not implemented")
}
func (UnimplementedFrontendNvmeServiceServer) StatsNvmeNamespace(context.Context, *StatsNvmeNamespaceRequest) (*StatsNvmeNamespaceResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StatsNvmeNamespace not implemented")
}

// UnsafeFrontendNvmeServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to FrontendNvmeServiceServer will
// result in compilation errors.
type UnsafeFrontendNvmeServiceServer interface {
	mustEmbedUnimplementedFrontendNvmeServiceServer()
}

func RegisterFrontendNvmeServiceServer(s grpc.ServiceRegistrar, srv FrontendNvmeServiceServer) {
	s.RegisterService(&FrontendNvmeService_ServiceDesc, srv)
}

func _FrontendNvmeService_CreateNvmeSubsystem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateNvmeSubsystemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).CreateNvmeSubsystem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/CreateNvmeSubsystem",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).CreateNvmeSubsystem(ctx, req.(*CreateNvmeSubsystemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_DeleteNvmeSubsystem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteNvmeSubsystemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).DeleteNvmeSubsystem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/DeleteNvmeSubsystem",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).DeleteNvmeSubsystem(ctx, req.(*DeleteNvmeSubsystemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_UpdateNvmeSubsystem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateNvmeSubsystemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).UpdateNvmeSubsystem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/UpdateNvmeSubsystem",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).UpdateNvmeSubsystem(ctx, req.(*UpdateNvmeSubsystemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_ListNvmeSubsystems_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListNvmeSubsystemsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).ListNvmeSubsystems(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/ListNvmeSubsystems",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).ListNvmeSubsystems(ctx, req.(*ListNvmeSubsystemsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_GetNvmeSubsystem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetNvmeSubsystemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).GetNvmeSubsystem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/GetNvmeSubsystem",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).GetNvmeSubsystem(ctx, req.(*GetNvmeSubsystemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_StatsNvmeSubsystem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StatsNvmeSubsystemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).StatsNvmeSubsystem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/StatsNvmeSubsystem",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).StatsNvmeSubsystem(ctx, req.(*StatsNvmeSubsystemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_CreateNvmeController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateNvmeControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).CreateNvmeController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/CreateNvmeController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).CreateNvmeController(ctx, req.(*CreateNvmeControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_DeleteNvmeController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteNvmeControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).DeleteNvmeController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/DeleteNvmeController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).DeleteNvmeController(ctx, req.(*DeleteNvmeControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_UpdateNvmeController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateNvmeControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).UpdateNvmeController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/UpdateNvmeController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).UpdateNvmeController(ctx, req.(*UpdateNvmeControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_ListNvmeControllers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListNvmeControllersRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).ListNvmeControllers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/ListNvmeControllers",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).ListNvmeControllers(ctx, req.(*ListNvmeControllersRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_GetNvmeController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetNvmeControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).GetNvmeController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/GetNvmeController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).GetNvmeController(ctx, req.(*GetNvmeControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_StatsNvmeController_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StatsNvmeControllerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).StatsNvmeController(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/StatsNvmeController",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).StatsNvmeController(ctx, req.(*StatsNvmeControllerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_CreateNvmeNamespace_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateNvmeNamespaceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).CreateNvmeNamespace(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/CreateNvmeNamespace",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).CreateNvmeNamespace(ctx, req.(*CreateNvmeNamespaceRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_DeleteNvmeNamespace_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteNvmeNamespaceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).DeleteNvmeNamespace(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/DeleteNvmeNamespace",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).DeleteNvmeNamespace(ctx, req.(*DeleteNvmeNamespaceRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_UpdateNvmeNamespace_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateNvmeNamespaceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).UpdateNvmeNamespace(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/UpdateNvmeNamespace",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).UpdateNvmeNamespace(ctx, req.(*UpdateNvmeNamespaceRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_ListNvmeNamespaces_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListNvmeNamespacesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).ListNvmeNamespaces(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/ListNvmeNamespaces",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).ListNvmeNamespaces(ctx, req.(*ListNvmeNamespacesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_GetNvmeNamespace_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetNvmeNamespaceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).GetNvmeNamespace(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/GetNvmeNamespace",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).GetNvmeNamespace(ctx, req.(*GetNvmeNamespaceRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FrontendNvmeService_StatsNvmeNamespace_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StatsNvmeNamespaceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FrontendNvmeServiceServer).StatsNvmeNamespace(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/opi_api.storage.v1.FrontendNvmeService/StatsNvmeNamespace",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FrontendNvmeServiceServer).StatsNvmeNamespace(ctx, req.(*StatsNvmeNamespaceRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// FrontendNvmeService_ServiceDesc is the grpc.ServiceDesc for FrontendNvmeService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var FrontendNvmeService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "opi_api.storage.v1.FrontendNvmeService",
	HandlerType: (*FrontendNvmeServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateNvmeSubsystem",
			Handler:    _FrontendNvmeService_CreateNvmeSubsystem_Handler,
		},
		{
			MethodName: "DeleteNvmeSubsystem",
			Handler:    _FrontendNvmeService_DeleteNvmeSubsystem_Handler,
		},
		{
			MethodName: "UpdateNvmeSubsystem",
			Handler:    _FrontendNvmeService_UpdateNvmeSubsystem_Handler,
		},
		{
			MethodName: "ListNvmeSubsystems",
			Handler:    _FrontendNvmeService_ListNvmeSubsystems_Handler,
		},
		{
			MethodName: "GetNvmeSubsystem",
			Handler:    _FrontendNvmeService_GetNvmeSubsystem_Handler,
		},
		{
			MethodName: "StatsNvmeSubsystem",
			Handler:    _FrontendNvmeService_StatsNvmeSubsystem_Handler,
		},
		{
			MethodName: "CreateNvmeController",
			Handler:    _FrontendNvmeService_CreateNvmeController_Handler,
		},
		{
			MethodName: "DeleteNvmeController",
			Handler:    _FrontendNvmeService_DeleteNvmeController_Handler,
		},
		{
			MethodName: "UpdateNvmeController",
			Handler:    _FrontendNvmeService_UpdateNvmeController_Handler,
		},
		{
			MethodName: "ListNvmeControllers",
			Handler:    _FrontendNvmeService_ListNvmeControllers_Handler,
		},
		{
			MethodName: "GetNvmeController",
			Handler:    _FrontendNvmeService_GetNvmeController_Handler,
		},
		{
			MethodName: "StatsNvmeController",
			Handler:    _FrontendNvmeService_StatsNvmeController_Handler,
		},
		{
			MethodName: "CreateNvmeNamespace",
			Handler:    _FrontendNvmeService_CreateNvmeNamespace_Handler,
		},
		{
			MethodName: "DeleteNvmeNamespace",
			Handler:    _FrontendNvmeService_DeleteNvmeNamespace_Handler,
		},
		{
			MethodName: "UpdateNvmeNamespace",
			Handler:    _FrontendNvmeService_UpdateNvmeNamespace_Handler,
		},
		{
			MethodName: "ListNvmeNamespaces",
			Handler:    _FrontendNvmeService_ListNvmeNamespaces_Handler,
		},
		{
			MethodName: "GetNvmeNamespace",
			Handler:    _FrontendNvmeService_GetNvmeNamespace_Handler,
		},
		{
			MethodName: "StatsNvmeNamespace",
			Handler:    _FrontendNvmeService_StatsNvmeNamespace_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "frontend_nvme_pcie.proto",
}