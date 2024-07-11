# Implement CloudRPC gRPC server

from concurrent import futures
import logging
import math
import time

import grpc
from gen import cloudrpc_pb2
from gen import cloudrpc_pb2_grpc
from gen import networkpolicy_pb2
from gen import networkpolicy_pb2_grpc

class CloudInfraServiceServicer(cloudrpc_pb2_grpc.CloudInfraServiceServicer):
    def __init__(self):
        return

    def CreateSecurityRule(self, request, context):
        print(f'Request received: {request}')
        secRule = request.securityrule
        context.set_code(grpc.StatusCode.OK)
        context.set_details('Rule created successfully')
        return secRule

def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    cloudrpc_pb2_grpc.add_CloudInfraServiceServicer_to_server(
        CloudInfraServiceServicer(), server
    )
    #server.add_insecure_port("[::]:50051")
    server.add_insecure_port("localhost:50051")
    #server.add_insecure_port("143.182.137.94:50051")
    server.start()
    server.wait_for_termination()


if __name__ == "__main__":
    logging.basicConfig()
    serve()