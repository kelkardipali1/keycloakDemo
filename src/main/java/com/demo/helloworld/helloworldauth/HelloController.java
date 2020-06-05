package com.demo.helloworld.helloworldauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class HelloController {

    @PostMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/hi")
    public String sayHi(){
        return "hi";
    }
}
