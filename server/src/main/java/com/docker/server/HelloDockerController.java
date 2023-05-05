package com.docker.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello From Server Container";
    }
}
