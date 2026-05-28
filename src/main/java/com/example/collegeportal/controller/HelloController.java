package com.example.collegeportal.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://courageous-rolypoly-024d70.netlify.app")
public class HelloController {

    @GetMapping("/api/health")
    public String health() {
        return "College Portal API is running";
    }
}
