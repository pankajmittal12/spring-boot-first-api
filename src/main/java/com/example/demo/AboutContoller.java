package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AboutContoller {
    
    @GetMapping("/about")
    public String getMethodName() {
        return "About";
    }
    
}
