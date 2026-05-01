package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class GetData {
    
    @PostMapping("/enterdata")
    public String postMethodName(@RequestBody String entity) {
        return entity;
    }
    
}
