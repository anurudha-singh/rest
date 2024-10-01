package com.hvt.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EntityScan(basePackages = "com.hvt.rest.entities")
@SpringBootApplication(scanBasePackages = {"com.hvt.rest"})
public class RestApiApplication {

	@GetMapping("/")
	String greetMessage(){
		return "Hello, How are you?";
	}
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
		System.out.println("Server is running...");
	}

}
