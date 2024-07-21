package com.gamyacode.deployspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployspringbootApplication {

    @GetMapping("/hi")
    public String hello(){
        return"Well come to springboot world";
    }
    public static void main(String[] args) {
        SpringApplication.run(DeployspringbootApplication.class, args);
    }

}
