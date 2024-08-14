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
    private Agent oracleAgentSecond;


    // DI using Setter. left old comment about constructor.
    // are they same? who knows.
    // See Smith's bean scope
    @Autowired
    public void setAgent(@Qualifier("smithAgent") Agent theAgent,
                         @Qualifier("smithAgent") Agent theOtherAgent,
                         @Qualifier("oracleAgent") Agent oracleAgent,
                         @Qualifier("oracleAgent") Agent oracleAgentSecond) {
        myAgent = theAgent;
        otherAgent = theOtherAgent;
        oracleAgent = otherAgent;
        oracleAgentSecond = oracleAgentSecond;
    }

    @GetMapping("/role")
    public String getRole() {
        return myAgent.getRole();
    }

    @GetMapping("/who")
    public String getWho() {
        return "Agent Smith is the same one you met? " + (myAgent == otherAgent) +
                "\t Is there only one Oracle? " + (oracleAgent == oracleAgentSecond);
    }

    @GetMapping("/")
    public String getHome() {
        return "You are in the Matrix";
    }
}
