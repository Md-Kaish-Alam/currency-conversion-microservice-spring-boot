package com.nuwaish.microservice_currency_conversion_service_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceCurrencyConversionServiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCurrencyConversionServiceEurekaServerApplication.class, args);
	}

}
