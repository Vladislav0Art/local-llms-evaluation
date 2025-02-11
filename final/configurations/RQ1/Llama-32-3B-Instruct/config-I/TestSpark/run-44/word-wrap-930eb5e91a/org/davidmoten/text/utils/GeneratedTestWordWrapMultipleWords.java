package org.davidmoten.text.utils;

public class GeneratedTestWordWrapMultipleWords {

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

    @Test
    public void testWordWrapMultipleWords() {
        String input = "This is another test with multiple words";
        String expectedOutput = "This is another test with multiple words";
        assertEquals(expectedOutput, WordWrap.wordWrap(input));
    }

}