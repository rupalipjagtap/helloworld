package com.agileit.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		System.out.println("Hello Have a good day....");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
