md generatePbRpcs
protoc_server.exe --java_out=generatePbRpcs PbHelloRpc.proto
protoc_server.exe --plugin=protoc-gen-grpc-java=./protoc-gen-grpc-java-1.32.1-windows-x86_64.exe --grpc-java_out=generatePbRpcs PbHelloRpc.proto

