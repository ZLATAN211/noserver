package com.example.kadserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class KadServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KadServerApplication.class, args);
    }

}
