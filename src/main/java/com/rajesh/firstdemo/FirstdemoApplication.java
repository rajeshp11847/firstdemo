package com.rajesh.firstdemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "FIRSTDEMO SERVICE",version = "v 3.0",description = "FIRSTDEMO API Crud operation"))
public class FirstdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstdemoApplication.class, args);
	}

}
