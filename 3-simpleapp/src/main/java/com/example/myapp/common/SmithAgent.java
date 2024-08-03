package com.example.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class SmithAgent implements Agent {
    @Override
    public String getRole() {
        return "You keep the system clean from bugs and garbage code. You can" +
                " create copies of yourself and take care of problems like " +
                "Neo and the rebels who have invaded the Matrix.";
    }
}
