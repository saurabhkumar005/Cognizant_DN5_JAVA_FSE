package com.cognizant.tddlearn;

import com.cognizant.tddlearn.service.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddLearnApplication implements CommandLineRunner {

	@Autowired
	private LoggingService loggingService;

	public static void main(String[] args) {
		SpringApplication.run(TddLearnApplication.class, args);
	}

	@Override
	public void run(String... args) {

		loggingService.login("admin");
		loggingService.login("");
		loggingService.login("guest");
	}
}