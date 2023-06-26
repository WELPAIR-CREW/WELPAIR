package com.hielectro.welpair.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.hielectro.welpair", exclude = SecurityAutoConfiguration.class)
public class WelpairApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelpairApplication.class, args);
    }

}