package com.test.demomaven21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoMaven21Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoMaven21Application.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello maven21";
    }
}
