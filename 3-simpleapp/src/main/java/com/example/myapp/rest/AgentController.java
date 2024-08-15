package com.example.myapp.rest;

import com.example.myapp.common.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Here we will try two things.
1. The default singleton instance of a bean as only one instance exists
2. Setting the scope of said bean.
 */
@RestController
public class AgentController {

    private Agent myAgent;
    private Agent otherAgent;
    private Agent oracleAgent;
    private Agent architectAgent;


    // DI using Setter. left old comment about constructor.
    // are they same? who knows.
    // See Smith's bean scope
    @Autowired
    public void setAgent(@Qualifier("smithAgent") Agent theAgent,
                         @Qualifier("smithAgent") Agent theOtherAgent,
                         @Qualifier("oracleAgent") Agent theOracleAgent,
                         @Qualifier("architect") Agent theArchitectAgent
    ) {
        myAgent = theAgent;
        otherAgent = theOtherAgent;
        oracleAgent = theOracleAgent;
        architectAgent = theArchitectAgent;


    }

    @GetMapping("/role")
    public String getRole() {
        return myAgent.getRole();
    }

    @GetMapping("/who")
    public String getWho() {
        return "Characters are " + myAgent.getClass().getName() + ", " +
                otherAgent.getClass().getName() + ", " +
                oracleAgent.getClass().getName() + ", " +
                architectAgent.getClass().getName()
                ;
    }

    @GetMapping("/")
    public String getHome() {
        return "You are in the Matrix";
    }
}
