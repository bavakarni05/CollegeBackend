package com.example.collegeportal.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://legendary-fairy-9fc3d3.netlify.app")
public class HelloController {

    @GetMapping("/api/health")
    public String health() {
        return "College Portal API is running";
    }
}
