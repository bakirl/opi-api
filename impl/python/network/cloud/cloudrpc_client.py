import logging

import grpc
from gen import cloudrpc_pb2
from gen import networkpolicy_pb2
from gen import networktypes_pb2

from gen import cloudrpc_pb2_grpc

def create_rule(stub):
    ipAddress = networktypes_pb2.IPAddress(
        af=networktypes_pb2.IP_AF_INET,
        v4_addr=0x0a000001)
    ipPrefix = networktypes_pb2.IPPrefix(
        len=24,
        addr=ipAddress)
    l3Match = networktypes_pb2.RuleL3Match(
        proto_num=6, # TCP
        dst_prefix=ipPrefix)
    match = networktypes_pb2.RuleMatch(
        l3_match=l3Match)
    secRuleAttrs = networkpolicy_pb2.SecurityRuleAttrs(
        match=match,
        action=networktypes_pb2.SECURITY_RULE_ACTION_ALLOW)
    secRuleSpec = networkpolicy_pb2.SecurityRuleSpec(
        attrs=secRuleAttrs)
    secRule = networkpolicy_pb2.SecurityRule(
        name="allow-outbound",
        spec=secRuleSpec)
    secRuleReq = cloudrpc_pb2.CreateSecurityRuleRequest(
        parent="xxx", # @todo What should this be?!
        securityrule=secRule)
    
    print(f'secRuleReq = {secRuleReq}')

    response = stub.CreateSecurityRule(secRuleReq)

    print(f'response = {response}')
   
def run():
    # NOTE(gRPC Python Team): .close() is possible on a channel and should be
    # used in circumstances in which the with statement does not fit the needs
    # of the code.
    with grpc.insecure_channel("localhost:50051") as channel:
        stub = cloudrpc_pb2_grpc.CloudInfraServiceStub(channel)
        create_rule(stub)
        
if __name__ == "__main__":
    logging.basicConfig()
    run()