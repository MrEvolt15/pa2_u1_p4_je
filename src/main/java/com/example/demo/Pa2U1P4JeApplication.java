package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4JeApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4JeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Hola mundo");
		/*Spring Framework: esto es un framework que permite la construccion/desarrollo
		 * de aplicaciones basadas en Spring*/
	}

}
