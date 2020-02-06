package com.docker.jenkins.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greet")
public class GreetingsResource {

    @GetMapping("/greetings")
    public String all() {
        return "Hello  world spring-boot-jenkins image";
    }
}
