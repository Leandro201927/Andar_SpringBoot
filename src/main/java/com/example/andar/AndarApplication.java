package com.example.andar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AndarApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(AndarApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}