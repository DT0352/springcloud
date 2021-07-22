package com.fuvidy.spring_cloud_demo_eureka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudDemoEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoEurekaServiceApplication.class, args);
	}

}
