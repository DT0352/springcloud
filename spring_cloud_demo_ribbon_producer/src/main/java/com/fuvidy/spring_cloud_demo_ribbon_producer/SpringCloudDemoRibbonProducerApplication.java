package com.fuvidy.spring_cloud_demo_ribbon_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudDemoRibbonProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoRibbonProducerApplication.class, args);
	}
}
