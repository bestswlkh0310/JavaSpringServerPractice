package com.example.boardserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BoardServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardServerApplication.class, args);
    }
}