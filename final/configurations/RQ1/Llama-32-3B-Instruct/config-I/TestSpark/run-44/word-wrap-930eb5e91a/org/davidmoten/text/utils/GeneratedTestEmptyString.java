package org.davidmoten.text.utils;

public class GeneratedTestEmptyString {

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
    public void testEmptyString() {
        String input = "";
        String expectedOutput = "";
        assertEquals(expectedOutput, WordWrap.wordWrap(input));
    }

}