package com.example.loja_vitual_jdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class LojaVitualJdevApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVitualJdevApplication.class, args);
	}

}
