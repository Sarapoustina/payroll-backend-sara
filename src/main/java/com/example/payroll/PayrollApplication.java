package com.example.payroll;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class PayrollApplication {
	public static void main(String[] args) {
		SpringApplication.run(PayrollApplication.class, args);
	}
}

