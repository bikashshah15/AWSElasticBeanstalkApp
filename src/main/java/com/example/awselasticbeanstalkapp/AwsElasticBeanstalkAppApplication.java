package com.example.awselasticbeanstalkapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class AwsElasticBeanstalkAppApplication {

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsElasticBeanstalkAppApplication.class, args);
    }

}
