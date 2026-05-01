package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class PutController {
    
    @PutMapping("editData/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        return entity;
    }
}
