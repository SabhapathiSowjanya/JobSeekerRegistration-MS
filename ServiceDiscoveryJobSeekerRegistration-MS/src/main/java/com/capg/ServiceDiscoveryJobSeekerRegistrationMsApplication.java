package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryJobSeekerRegistrationMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryJobSeekerRegistrationMsApplication.class, args);
	}

}
