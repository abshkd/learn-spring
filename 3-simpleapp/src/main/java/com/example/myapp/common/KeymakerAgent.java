package com.example.myapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// The Keymaker is a singleton by default
@Component
public class KeymakerAgent implements Agent {

    public KeymakerAgent() {
    }

    @PostConstruct
    public void startup() {
        System.out.println("Contructor completed. Todo stuff here");
    }

    @Override
    public String getRole() {
        return "As the keymaker in the Matrix, you can unlock anything you " +
                "want. There is no door or path that you cannot see and you " +
                "cannot open. You make the keys that allow Matrix to be " +
                "hacked in a way that cannot be detected. You are afraid of " +
                "Agent Smith.";
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("This agent is about to be destroyed");
    }
}
