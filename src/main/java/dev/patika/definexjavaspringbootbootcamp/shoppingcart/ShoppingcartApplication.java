package dev.patika.definexjavaspringbootbootcamp.shoppingcart;

import dev.patika.definexjavaspringbootbootcamp.shoppingcart.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingcartApplication implements CommandLineRunner {

	@Autowired
	GreetingService greetingService;

	public static void main(String[] args) {
		SpringApplication.run(ShoppingcartApplication.class);
	}

	@Override
	public void run(String... args) throws Exception {
		greetingService.greet();
	}
}