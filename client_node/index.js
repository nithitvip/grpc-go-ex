const grpc = require('@grpc/grpc-js');
const protoLoader = require('@grpc/proto-loader');

const PROTO_PATH = __dirname + '/../proto/greet/v1/greet.proto';

const packageDefinition = protoLoader.loadSync(
    PROTO_PATH,
    {keepCase: true,
        longs: String,
        enums: String,
        defaults: true,
        oneofs: true
    });
const greet_proto = grpc.loadPackageDefinition(packageDefinition).greet.v1;


function main() {
    let target = 'localhost:50051';
    let client = new greet_proto.GreetService(target, grpc.credentials.createInsecure());
    client.GreetUnary({name: "i am node", title:"hello"}, function(err, response) {
        console.log(err)
        console.log('Greeting:', response.message);
    });
}

main()