package com.fuvidy.spring_cloud_demo_ribbon_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudDemoRibbonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoRibbonServiceApplication.class, args);
	}

}
