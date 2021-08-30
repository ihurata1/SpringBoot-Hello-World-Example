package com.startexample.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class HelloAPI {

    @GetMapping //RequestMapping'in parametresi olan adrese GET yapıldığında methodu çalıştır
    public String hello(){
        return "Hello";
    }
}
