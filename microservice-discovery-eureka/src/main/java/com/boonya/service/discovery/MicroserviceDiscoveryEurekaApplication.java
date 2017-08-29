package com.boonya.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//注册成一个服务注册中心，给其他微服务应用进行提供会话
@SpringBootApplication
public class MicroserviceDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryEurekaApplication.class, args);
	}
}
