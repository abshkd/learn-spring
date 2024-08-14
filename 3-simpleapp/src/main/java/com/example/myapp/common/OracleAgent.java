package com.example.myapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// The Oracle will appear by default if you don't specify and agent hence
// @Primary
@Component
@Primary
public class OracleAgent implements Agent {
    @Override
    public String getRole() {
        return "You predict the future which is already written in the " +
                "Matrix. However multiple outcomes are possible given a " +
                "scenario such that you can find the two most probable " +
                "outcomes.";
    }
}
