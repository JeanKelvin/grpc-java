## What's gRPC?

https://grpc.io/  
gRPC is a free and open-source framework developed by Google.  
gRPC is part of the Cloud Native Computation Foundation (CNCF) - like Docker & Kubernetes for example.  
At a high level, it allows you to define REQUEST and RESPONSE for RPC(Remote Procedure Calls) and handles all the rest for you.  
On top of it, it's modern, fast and efficient, build on top of HTTP/2, low latency, supports streaming, language independent, and makes
is super easy to plug in authentication, load balacing, logging and monitoring.


## What's an RPC?
An RPC is a Remote Procedure Call.  
In your CLIENT code, it looks you're just calling a function directly on the SERVER.  
It's not a new concept(CORBA ha this before).  
With gRPC, it's implemented very cleanly and sloves a lot of problems.  
The rest of the gRPC code will be generated for you and you'll have to provide an implementation for it.  
One .proto file works for over 12 programming languages (server and client), and allows you to use a framework
that scales to milions of RPC per seconds.


## Why Protocol Buffers?
Protocol Buffers are language agnostic.  
Code can be generated for pretty much any language.  
Data is binary and efficiently serialized (small payloads).  
Very convenient for transporting a lot of data.  
Protocol Buffers allows for easy API evoluting using rules.  
Protocol Buffers is used to define the:
    Messages (data, Request and Response).
    Service (Service name and RPC endpoints)

https://developers.google.com/protocol-buffers
https://developers.google.com/protocol-buffers/docs/javatutorial


gRPC uses Protocol Buffers for communications.
Measure the payload size vs JSON:

JSON: 55 bytes                                     
{                                                  
    "age : 26,                                         
    "first_name" : "Jean"                                 
    "last_name" : "Cardoso"                            
}
                                                  
Same in Protocol Buffers: 20 bytes  
message Person {  
    int32 age = 1;  
    string first_name = 2;  
    string last_name = 3;  
}  

We save in Network Bandwidth.

Parsing JSON is actually CPU intensive (because the format is human readable).
Parsing Protocol Buffers (binary format) is less CPU intensive because it's closer to how a machine represents data.
By using gRPC, the use of Protocol Buffers means faster and more efficient communication, friendly with mobile devices that have a slower CPU.


## What's HTTP/2?
gRPC leverages HTTP/2 as a backbone for communications.

Demo: https://imagekit.io/demo/http2-vs-http1  
https://medium.com/@factoryhr/http-2-the-difference-between-http-1-1-benefits-and-how-to-use-it-38094fa0e95b


## gRPC vs REST
https://husobee.github.io/golang/rest/grpc/2016/05/28/golang-rest-v-grpc.html  
https://www.slideshare.net/borisovalex/grpc-vs-rest-let-the-battle-begin-81800634  
https://docs.microsoft.com/en-us/aspnet/core/grpc/comparison?view=aspnetcore-3.0  


# What's a Server Streaming API?
Server Streaming RPC API are a NEW kind API enable thanks to HTTP/2.    
The client will send one message to the server and will receive many responses from the server, possibly an infinite number.  

# What's a Client Streaming API?
Client Streaming RPC API are a NEW kind API enable thanks to HTTP/2.  
The client will send many message to the server and will receive one response from the server (at any time).  





