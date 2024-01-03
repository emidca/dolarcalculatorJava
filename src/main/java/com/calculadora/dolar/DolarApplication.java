package com.calculadora.dolar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.calculadora.dolar")
public class DolarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DolarApplication.class, args);
		System.out.println("Running...");
	}

}
