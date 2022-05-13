package org.example.agent.second;

import java.lang.instrument.Instrumentation;

public class SecondAgent {
    public static void premain( String agentArgs, Instrumentation instrumentation ) {
        System.out.println("Second Agent Start!");
    }
}
