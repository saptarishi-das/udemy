package com.tutorials.springboot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!! The time on the server is: " + new Date() + "\n";
    }

    @GetMapping("/sayhello") 
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + ".\n";
    }
}
