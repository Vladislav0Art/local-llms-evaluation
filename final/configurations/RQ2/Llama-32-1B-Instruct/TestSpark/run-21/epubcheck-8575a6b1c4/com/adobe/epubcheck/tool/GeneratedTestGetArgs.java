package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetArgs {

    @Test
    public void testGetArgs() {
        String[] commandLineArgs = System.getenv("CARGO RUNTIME").split("\\s+");

        ArrayList<String> argsList = new ArrayList<>();
        for (String arg : commandLineArgs) {
            if (!arg.isEmpty()) {
                argsList.add(arg);
            }
        }

        assertEquals(2, argsList.size());
    }
}

class MyService extends org.junit.Test {
    @Override
    public String log(String message) {
        return "Logging: " + message;
    }

}