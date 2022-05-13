package org.example.agent.first;

import java.lang.instrument.Instrumentation;

public class FirstAgent {
    public static void premain( String agentArgs, Instrumentation instrumentation ) {
        System.out.println("First Agent Start!");
    }
}
