package com.example.grpc.scraper.demoscraper;

import com.example.grpc.scraper.proto.ExtractionRequest;
import com.example.grpc.scraper.proto.ExtractionResponse;
import com.example.grpc.scraper.proto.ExtractionServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.internal.testing.StreamRecorder;
import io.grpc.stub.StreamObserver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExtractionServiceTest {

    private ManagedChannel channel;
    private ExtractionServiceGrpc.ExtractionServiceStub clientStub;

    @Before
    public void setup(){
        this.channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();
        this.clientStub = ExtractionServiceGrpc.newStub(channel);
    }

    @Test
    public void bookStreamingTest() throws InterruptedException {
        ExtractionRequest request = ExtractionRequest.newBuilder().setOrgId(123456).build();
        StreamRecorder<ExtractionResponse> responseStreamRecorder = StreamRecorder.create();
        this.clientStub.extractOrgJobs(request, responseStreamRecorder);
        Assert.assertNull(responseStreamRecorder.getError());
        List<ExtractionResponse> results = responseStreamRecorder.getValues();
    }

    @After
    public void teardown(){
        this.channel.shutdown();
    }

}
