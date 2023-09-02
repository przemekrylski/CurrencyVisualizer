package com.example.CurrencyVisualizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CurrencyVisualizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyVisualizerApplication.class, args);
	}
}
