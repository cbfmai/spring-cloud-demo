package com.mmtech.cloud.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "Hello, dear " + name + ", welcome!";
    }


}
