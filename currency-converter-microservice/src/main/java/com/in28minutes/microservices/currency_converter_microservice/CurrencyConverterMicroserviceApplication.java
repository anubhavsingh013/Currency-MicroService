package com.in28minutes.microservices.currency_converter_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConverterMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterMicroserviceApplication.class, args);
	}

}
