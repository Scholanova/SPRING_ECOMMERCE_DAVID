package com.scholanova.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class EcommerceApp {

    public static void main(String[] args) {
        final org.springframework.context.ConfigurableApplicationContext run = run(EcommerceApp.class, args);
    }
}