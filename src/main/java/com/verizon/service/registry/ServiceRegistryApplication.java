package com.verizon.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		System.out.println("befor bootstrap the spring boot "); 
		SpringApplication.run(ServiceRegistryApplication.class, args);
		System.out.println("after bootstrap the spring boot ");
	}

}
