package com.example.evento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.evento.controllers"})
public class EventoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventoApplication.class, args);
    }

}
