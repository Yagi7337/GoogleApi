package com.api.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.api.google"})
public class GoogleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleApiApplication.class, args);
	}
}
