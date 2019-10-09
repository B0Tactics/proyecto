package edu.eci.arsw.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "edu.eci.arsw.acount" })
public class apiAplication {

    public static void main(String[] args) {
        SpringApplication.run(apiAplication.class, args);
    }
}