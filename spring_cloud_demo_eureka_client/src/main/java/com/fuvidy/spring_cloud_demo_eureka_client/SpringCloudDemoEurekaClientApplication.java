package com.fuvidy.spring_cloud_demo_eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudDemoEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoEurekaClientApplication.class, args);
	}

}
