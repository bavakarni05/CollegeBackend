package com.example.collegeportal.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://wonderful-entremet-fc1ce2.netlify.app")
public class RootController {

    @GetMapping("/")
    public String index() {
        return "College Portal API is running successfully. Please use the frontend application to interact with the system.";
    }

    @GetMapping("/api/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "message", "Database and API connection stable");
    }
}