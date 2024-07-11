# Introduction

This directory contains a Python implementation of the CloudInfraService service in the
package opi-api.network.cloud, which is defined in
[cloudrpc.proto](../../../../network/cloud/cloudrpc.proto), and specifically of the
network security policies defined in
[networkpolicy.proto](../../../../network/cloud/networkpolicy.proto).

# Building and Running the code

## Build

Building involves running the protoc compiler against the relevant *.proto files to 
generate the needed *_pb.py and *_pb_grpc.py files.

```bash
make build
```

## Run the server and client

Note that the server has yet to be integrated with our L4FW implementation. Eventually, it 
should call the VPP CLI or API, or generate bytecode (depending on the final implemention of
the policy engine). For now, it just prints out the request parameter, and returns the 
required responses.

In one window, run the server:

```bash
make run_server
```

In another window, run the client:

```bash
make run_client
```
