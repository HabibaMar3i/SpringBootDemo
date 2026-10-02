package com.habiba.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World!");
		// The old way
		// Alien obj = new Alien();
		// obj.coding();

		// New way
		Alien obj1 = context.getBean(Alien.class);
		obj1.coding();
	}

}
