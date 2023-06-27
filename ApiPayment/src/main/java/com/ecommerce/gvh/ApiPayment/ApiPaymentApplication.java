package com.ecommerce.gvh.ApiPayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPaymentApplication.class, args);
	}

}
