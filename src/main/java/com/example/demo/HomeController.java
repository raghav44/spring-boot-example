package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${spring.profiles.active}")
    private String environment;

    @Value("${pageController.msg}")
    private String pageController;


    @Value("${my.secret}")
    private String mySecret;


    @Value("${msg}")
    private String message;


    @RequestMapping("/")
    public String home() {
        return message;
    }
}
