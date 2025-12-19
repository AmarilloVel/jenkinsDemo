package com.example.apiDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiJenkinsDemo/")
public class DemoController {

    @GetMapping("/hello")
    public String sayHello() {
        return "API response: Hola team";
    }
    public int calculateDiscount(int price) {
        if (price < 0) throw new IllegalArgumentException("The price can not be negative");
        return price - 10;
    }
}
