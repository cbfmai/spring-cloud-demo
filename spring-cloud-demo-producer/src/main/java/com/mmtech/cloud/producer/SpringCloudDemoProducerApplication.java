package com.mmtech.cloud.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDemoProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoProducerApplication.class, args);
    }
}
