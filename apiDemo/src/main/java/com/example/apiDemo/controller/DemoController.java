package com.example.apiDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiJenkinsDemo/")
public class DemoController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Respuesta de la API: Hola team";
    }
    public int calculateDiscount(int price) {
        if (price < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
        return price - 10;
    }
}
