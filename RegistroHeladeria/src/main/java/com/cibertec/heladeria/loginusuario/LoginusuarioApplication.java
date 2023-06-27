package com.cibertec.heladeria.loginusuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LoginusuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginusuarioApplication.class, args);
	}

}
