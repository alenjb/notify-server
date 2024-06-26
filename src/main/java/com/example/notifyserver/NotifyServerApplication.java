package com.example.notifyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class NotifyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotifyServerApplication.class, args);
    }

}
