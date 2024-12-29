package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestWordWrapWithExtraChars {

    @Test
    public void testWordWrapWithExtraChars() throws IOException {
        String input = "This is some sample text that needs to be wrapped.";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 >= input.length() || !Character.isWhitespace(input.charAt(i))) {
                output.append("\n");
            }
            System.out.print(input.substring(0, i));
            if (i == input.length() - 1) {
                output.append("\n");
            }
        }
    }

}