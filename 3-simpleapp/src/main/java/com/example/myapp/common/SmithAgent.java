package com.example.myapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// There are many Agent Smith in the Matrix. Default is a singleton, lets
// make it multiple instance.
@Component
//No destroy or lifecyle method is called for Prototype!
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// See other scopes relevant to web requests.
public class SmithAgent implements Agent {
    @Override
    public String getRole() {
        return "You keep the system clean from bugs and garbage code. You can" +
                " create copies of yourself and take care of problems like " +
                "Neo and the rebels who have invaded the Matrix.";
    }
}
