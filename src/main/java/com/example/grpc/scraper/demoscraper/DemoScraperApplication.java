package com.example.grpc.scraper.demoscraper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.grpc")
public class DemoScraperApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoScraperApplication.class, args);
	}

}
