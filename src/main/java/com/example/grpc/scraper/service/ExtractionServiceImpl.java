package com.example.grpc.scraper.service;


import com.example.grpc.scraper.proto.ExtractionRequest;
import com.example.grpc.scraper.proto.ExtractionResponse;
import com.example.grpc.scraper.proto.ExtractionServiceGrpc;
import com.example.grpc.scraper.proto.JobDetails;
import com.google.common.util.concurrent.Uninterruptibles;
import io.grpc.stub.StreamObserver;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.lognet.springboot.grpc.GRpcService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@GRpcService
public class ExtractionServiceImpl extends ExtractionServiceGrpc.ExtractionServiceImplBase {

    String URL = "https://jobs.gohire.io/shri-educare-limited-o9lf3xun/";

    @Override
    public void extractOrgJobs(ExtractionRequest request, StreamObserver<ExtractionResponse> responseObserver) {

        Document doc = null;
        try {
            doc = Jsoup.connect(URL).get();
            String title = doc.title();
            System.out.println("Title  " + title);
            Elements jobList = doc.select("div.job-list > a.gohire-job");

            List<JobDetails> jobTitles = new ArrayList<>();
            for (Element job : jobList) {
                String jobTitle = job.selectFirst("h3.job-title").text();
                JobDetails jobDetail = JobDetails.newBuilder().setJobTitle(jobTitle).build();
                jobTitles.add(jobDetail);
                if (jobTitles.size() > 4) {
                    ExtractionResponse.Builder response = ExtractionResponse.newBuilder()
                            .setCompany(request.getCompany())
                            .setOrgId(request.getOrgId())
                            .addAllJobDetails(jobTitles);
                    jobTitles.clear();
                    responseObserver.onNext(response.build());
                    Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
                }
            }
            responseObserver.onCompleted();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
