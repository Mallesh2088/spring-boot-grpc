package com.example.grpc.scraper.demoscraper;

import com.example.grpc.scraper.proto.*;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.internal.testing.StreamRecorder;
import io.grpc.stub.StreamObserver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

public class ExtractionServiceClient {

    private ExtractionServiceGrpc.ExtractionServiceBlockingStub blockingStub;

    public ExtractionServiceClient(Channel channel) {
        blockingStub = ExtractionServiceGrpc.newBlockingStub(channel);
    }

    public void extractJobs()  {
        ExtractionRequest request = ExtractionRequest.newBuilder()
                .setOrgId(356788)
                .setCompany("Gloss")
                .build();
        final Iterator<ExtractionResponse> responseIterator = blockingStub.extractOrgJobs(request);
        int counter = 0;
        while (responseIterator.hasNext()) {
            counter++;
            final ExtractionResponse extractionResponse = responseIterator.next();
            System.out.println("Stream number ::::  " + counter + " ....... " + extractionResponse.getCompany() + "    " + extractionResponse.getOrgId());
            try {
                String jsonString = JsonFormat.printer().print(extractionResponse);
                System.out.println(jsonString);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        String target = "localhost:6565";
        final ManagedChannel managedChannel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
        ExtractionServiceClient serviceClient = new ExtractionServiceClient(managedChannel);
        serviceClient.extractJobs();
    }

}
