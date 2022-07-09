package io.code.userws.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Environment environment;

    @GetMapping("/ping")
    public String ping(){
        return "user-pong at port "+ environment.getProperty("local.server.port");
    }
}
