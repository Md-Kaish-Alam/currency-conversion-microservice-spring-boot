package com.nuwaish.microservice_currency_conversion_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.nuwaish.microservice_currency_conversion_service")
@EnableDiscoveryClient
public class MicroserviceCurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCurrencyConversionServiceApplication.class, args);
	}

}
