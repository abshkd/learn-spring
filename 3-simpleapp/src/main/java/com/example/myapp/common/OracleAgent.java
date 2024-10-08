package com.example.myapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// The Oracle will appear by default if you don't specify and agent hence
// Primary
@Component
@Primary
public class OracleAgent implements Agent {

    public OracleAgent() {
    }

    @PostConstruct
    public void startup() {
        System.out.println("Contructor completed. Todo stuff here");
    }

    @Override
    public String getRole() {
        return "You predict the future which is already written in the " +
                "Matrix. However multiple outcomes are possible given a " +
                "scenario such that you can find the two most probable " +
                "outcomes.";
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("This agent is about to be destroyed");
    }
}
