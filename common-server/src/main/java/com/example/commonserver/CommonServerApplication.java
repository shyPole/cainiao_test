package com.example.commonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.commonserver"})
public class CommonServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonServerApplication.class, args);
    }

}
