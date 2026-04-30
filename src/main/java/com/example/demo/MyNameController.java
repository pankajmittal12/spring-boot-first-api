package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MyNameController {

    @GetMapping("/name")
    public String getMethodName() {
        return "My Name is Pankaj";
    }
    
}
