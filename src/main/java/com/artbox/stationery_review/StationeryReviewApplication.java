package com.artbox.stationery_review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StationeryReviewApplication extends SpringBootServletInitializer  {


	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(StationeryReviewApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(StationeryReviewApplication.class, args);
	}

}
