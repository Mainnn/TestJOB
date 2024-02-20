package com.example.testjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Controller")
public class TestJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJobApplication.class, args);
        System.out.println("test");
    }

}
