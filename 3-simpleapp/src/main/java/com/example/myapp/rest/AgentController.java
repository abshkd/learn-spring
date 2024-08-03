package com.example.myapp.rest;

import com.example.myapp.common.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {

    private Agent myAgent;

    // Constructor for dependency injection.
    // Autowired would be optional if only one constructor but recommended
    // for clarity. I have not defined Smith impl, but it should pick up the
    // only available choice.
    @Autowired
    public void setAgent(Agent theAgent) {
        myAgent = theAgent;
    }

    @GetMapping("/role")
    public String getRole() {
        return myAgent.getRole();
    }
}
