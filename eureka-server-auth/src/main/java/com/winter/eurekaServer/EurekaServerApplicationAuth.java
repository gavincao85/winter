package com.winter.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplicationAuth {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplicationAuth.class, args);
	}

}

