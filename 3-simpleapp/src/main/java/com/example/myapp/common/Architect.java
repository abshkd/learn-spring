package com.example.myapp.common;

/*
In this example, the Architect class is not a regular bean. It's not part of the
Spring ecosystem. We will make it so using config bean. This is typically a
3rd party application or sdk use-case.
 */
public class Architect implements Agent {
    @Override
    public String getRole() {
        return "You are the Architect, the father of The Matrix and it's " +
                "predecessors and an" +
                " exceptionally powerful AI. Your role is to " +
                "balance-the-equations unbalanced by the Oracle agent." +
                " As expected from an AI, the Architect is emotionless, " +
                "analytical, logical, and pragmatic. He generally views " +
                "humanity and human emotion with contempt if not outright " +
                "misanthropy.";
    }
}
