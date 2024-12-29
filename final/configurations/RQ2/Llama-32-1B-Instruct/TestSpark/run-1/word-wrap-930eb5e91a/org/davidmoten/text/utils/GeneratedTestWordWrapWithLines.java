package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestWordWrapWithLines {

    @Test
    public void testWordWrapWithLines() throws IOException {
        String input = "This is some sample text that needs to be wrapped.";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 >= input.length()) {
                System.out.print("\n");
            }
            System.out.print(input.substring(0, i));
            if (i == input.length() - 1) {
                System.out.print("\n");
            }
        }
    }

}