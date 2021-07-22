package com.fuvidy.spring_cloud_demo_security_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDemoSecurityServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoSecurityServerApplication.class, args);
	}

}
