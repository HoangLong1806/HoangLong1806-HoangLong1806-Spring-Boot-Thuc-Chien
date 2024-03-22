package com.example.springboot_1.controller;

import com.example.springboot_1.request.User;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestConTroller {
    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }
    @PostMapping("/user")
    public String hellouser(@RequestBody User body) {
        System.out.println(body.getAge());
        return "Name: " + body.getName() + " "+ "Age: " + body.getAge();
    }
}
