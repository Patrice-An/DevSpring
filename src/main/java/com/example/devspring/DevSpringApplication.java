package com.example.devspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"/Controleur",
		"/Vue",
		"/Model"
})
public class DevSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevSpringApplication.class, args);
	}

}
