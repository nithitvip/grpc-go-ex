generate by
``` 
protoc --go_out=server --go_opt=paths=source_relative --go-grpc_out=server --go-grpc_opt=paths=source_relative proto/greet/v1/greet.proto
```