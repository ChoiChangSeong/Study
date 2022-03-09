package com.study_java.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

@SpringBootApplication
public class TestApplication {
    public static void main(String[] args){
        SpringApplication.run(TestApplication.class, args);
    }
}