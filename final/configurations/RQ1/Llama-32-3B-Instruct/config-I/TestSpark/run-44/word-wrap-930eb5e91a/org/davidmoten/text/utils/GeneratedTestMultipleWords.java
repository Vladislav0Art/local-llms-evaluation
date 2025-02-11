package org.davidmoten.text.utils;

public class GeneratedTestMultipleWords {

    public static String wordWrap(String input) {
        StringBuilder result = new StringBuilder();
        int currentLineLength = 0;

        for (String word : input.split("\\s+")) {
            if (currentLineLength + word.length() > 50) {
                result.append("\n");
                currentLineLength = 0;
            }
            if (result.length() > 0) {
                result.append(" ");
                currentLineLength++;
            }
            result.append(word);
            currentLineLength += word.length();
        }

        return result.toString().trim();
    }
}

public class WordWrapTest {

    @Test
    public void testMultipleWords() {
        String input = "This is a multiple word string";
        String expectedOutput = "This\nis\na\nmultiple\nword\nstring";
        assertEquals(expectedOutput, WordWrap.wordWrap(input));
    }

}