package com.ecommerce.GVH.ApiInventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiInventoryApplication.class, args);
	}

}
