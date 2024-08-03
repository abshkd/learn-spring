package com.example.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${company.name}")
    private String companyName;

    @Value("${company.license}")
    private String licenseKey;

    @Value("${users.capacity}")
    private String userCapacity;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // add a second endpoint
    @GetMapping("/meditate")
    public String getDailyMindfulness() {
        return "Practice gratitude...";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "License Key: " + licenseKey + ", Company: " + companyName + ", Max Users: " + userCapacity;
    }
}
