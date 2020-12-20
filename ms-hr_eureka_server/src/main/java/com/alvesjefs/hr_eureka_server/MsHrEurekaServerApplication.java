package com.alvesjefs.hr_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsHrEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsHrEurekaServerApplication.class, args);
	}

}
