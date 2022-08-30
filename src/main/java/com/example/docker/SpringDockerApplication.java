package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerApplication {
	
	@GetMapping("/message")
	public String getMessage(){
		
		return "Hello from Spring webapp";
	}

	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}
