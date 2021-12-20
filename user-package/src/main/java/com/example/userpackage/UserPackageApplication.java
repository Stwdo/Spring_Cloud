package com.example.userpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserPackageApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserPackageApplication.class, args);
    }

}
