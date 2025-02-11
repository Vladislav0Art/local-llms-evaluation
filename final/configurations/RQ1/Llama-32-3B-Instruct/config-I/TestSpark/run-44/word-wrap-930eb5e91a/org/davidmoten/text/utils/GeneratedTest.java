package org.davidmoten.text.utils;

public class GeneratedTest {

    public static String wordWrap(String input) {
        StringBuilder result = new StringBuilder();
        int currentLineLength = 0;

        for (String word : input.split("\\s+")) {
            if (currentLineLength + word.length() > 50) {
                result.append("\n");
                currentLineLength = 0;
            }
            result.append(word).append(" ");
            currentLineLength += word.length() + 1;
        }

        return result.toString().trim();
    }
}

public class WordWrapTest {

    public static void main(String[] args) {
        org.junit.Test
        public void testWordWrap () {
            String input = "This is a test string that needs to be wrapped";
            String expectedOutput = "This is a test string that needs to be wrapped";
            assertEquals(expectedOutput, WordWrap.wordWrap(input));
        }

    }