package com.tsg.simulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication()
@EnableScheduling
public class TsgApplication {
	public static void main(String[] args) {
		SpringApplication.run(TsgApplication.class, args);
	}
}
