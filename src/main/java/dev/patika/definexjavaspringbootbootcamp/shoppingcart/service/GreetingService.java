package dev.patika.definexjavaspringbootbootcamp.shoppingcart.service;

import dev.patika.definexjavaspringbootbootcamp.shoppingcart.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Autowired
    Greeting greeting;

    public void greet() {
        System.out.println(greeting);
    }
}
