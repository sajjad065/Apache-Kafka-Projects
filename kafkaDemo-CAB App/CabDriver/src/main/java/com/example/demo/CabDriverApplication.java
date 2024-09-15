package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class CabDriverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabDriverApplication.class, args);
		
		KafkaTemplate template;
	}

}
