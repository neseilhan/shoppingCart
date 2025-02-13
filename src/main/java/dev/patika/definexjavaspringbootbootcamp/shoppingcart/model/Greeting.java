package dev.patika.definexjavaspringbootbootcamp.shoppingcart.model;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
    private String message;

    public Greeting() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("Greeting(message=%s)", this.message);
    }

}
