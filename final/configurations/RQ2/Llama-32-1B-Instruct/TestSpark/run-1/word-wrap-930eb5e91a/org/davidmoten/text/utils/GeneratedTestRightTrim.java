package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestRightTrim {

    @Test
    public void testRightTrim() throws IOException {
        String input = "This is some sample text that needs to be trimmed right.";
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            System.out.print(c);
        }
        System.out.println(output.toString().trim());
    }

}