package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestLogMessage {

    @Test
    public void testLogMessage() {
        System.out.println(log("My Service"));
    }
}

class MainRunner extends org.junit.Test {
    @Override
    public String run(String input) {
        return "Running report: " + input;
    }

}