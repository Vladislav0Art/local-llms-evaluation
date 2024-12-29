package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testWordWrap() throws IOException {
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

    @Test
    public void testWordWrapWithoutExtraChars() throws IOException {
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

    @Test
    public void testClose() throws IOException {
        String input = "";
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            System.out.print(c);
        }
    }

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

    @Test
    public void testLeftTrim() throws IOException {
        String input = "This is some sample text that needs to be trimmed left.";
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            System.out.print(c);
        }
        System.out.println(output.toString().trim());
    }

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