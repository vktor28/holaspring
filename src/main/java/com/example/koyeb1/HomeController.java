package com.example.koyeb1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping({"/", "/home", "/status"})
    public String getStatus(){
        return "hola mundo desde Spring Boot";
    }
    
}
