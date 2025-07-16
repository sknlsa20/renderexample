package com.example.mn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.mn"})
public class RenderexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenderexampleApplication.class, args);
	}

}
