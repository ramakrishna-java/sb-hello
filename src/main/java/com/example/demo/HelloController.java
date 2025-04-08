package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "hi hello world ..." + name;
    }
    
    @GetMapping("/hello")
    public String sayHelloGuest() {
        return "hi hello world ...";
    }
}