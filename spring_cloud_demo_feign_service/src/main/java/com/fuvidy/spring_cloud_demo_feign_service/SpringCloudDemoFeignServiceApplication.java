package com.fuvidy.spring_cloud_demo_feign_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SpringCloudDemoFeignServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoFeignServiceApplication.class, args);
    }

}
