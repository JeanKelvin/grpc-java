package com.github.grpc.calculator.client;

import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.PrimeNumberDecompositionRequest;
import com.proto.calculator.SumRequest;
import com.proto.calculator.SumResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatorClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        /** Unary */

        /*SumRequest request = SumRequest.newBuilder()
                .setFirstNumber(10)
                .setSecondNumer(25)
                .build();

        SumResponse response = stub.sum(request);

        System.out.println(request.getFirstNumber() + " + " + request.getSecondNumer() + " = " + response.getSumResult());
        */

        /** Streaming Server */
        long number = 5678904324334344345L;

        stub.primeNumberDecomposition(PrimeNumberDecompositionRequest.newBuilder()
                .setNumber(number)
                .build())
                .forEachRemaining(primeNumberDecompositionResponse -> System.out.println(primeNumberDecompositionResponse.getPrimeFactor()));

        channel.shutdown();
    }
}
