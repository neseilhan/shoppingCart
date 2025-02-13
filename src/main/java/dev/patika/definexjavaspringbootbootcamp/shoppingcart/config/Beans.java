package dev.patika.definexjavaspringbootbootcamp.shoppingcart.config;

import dev.patika.definexjavaspringbootbootcamp.shoppingcart.model.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Beans {

    @Bean
    public Greeting greeting() {
        Greeting greeting = new Greeting();
        greeting.setMessage("Merhaba Dünya!");
        return greeting;
    }
}