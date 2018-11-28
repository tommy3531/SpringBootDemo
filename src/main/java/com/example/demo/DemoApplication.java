package com.example.demo;

import com.example.demo.client.PropublicaClient;
import com.example.demo.controller.PropublicaController;
import com.example.demo.payroll.DBInit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropublicaController.class, args);

	}

	@Bean
	public CommandLineRunner DBInit() {
		return new DBInit();
	}
}



