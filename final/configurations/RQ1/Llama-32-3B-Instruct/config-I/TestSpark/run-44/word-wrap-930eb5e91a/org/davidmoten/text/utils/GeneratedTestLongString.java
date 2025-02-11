package org.davidmoten.text.utils;

public class GeneratedTestLongString {

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
    public void testLongString() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String expectedOutput = "Lorem\nipsum\nDolor\nSitus\namet,\nConsectetur\nAdipiscing\nElit.\nSed\nDo\nEiusmod\nTempor\nIncididunt\nUt\nLabore\nEt\nDolore\nMagna\nAl qua";
        assertEquals(expectedOutput, WordWrap.wordWrap(input));
    }

}