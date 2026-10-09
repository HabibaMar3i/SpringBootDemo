package com.habiba.app;

import com.habiba.app.model.Alien;
import com.habiba.app.model.Laptop;
import com.habiba.app.service.LaptopService;
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
		System.out.println(obj1.getAge());
		obj1.coding();

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
