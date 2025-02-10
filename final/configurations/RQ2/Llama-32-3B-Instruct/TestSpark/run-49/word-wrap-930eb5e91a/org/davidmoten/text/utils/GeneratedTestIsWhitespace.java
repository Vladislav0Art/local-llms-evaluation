package org.davidmoten.text.utils;

public class GeneratedTestIsWhitespace {

    public static String leftTrim(String word) {
        StringBuilder trimmedWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                trimmedWord.append(c);
            }
        }
        return trimmedWord.toString();
    }

    public static String rightTrim(String word) {
        StringBuilder trimmedWord = new StringBuilder(word);
        while (trimmedWord.length() > 0 && Character.isWhitespace(trimmedWord.charAt(trimedWord.length() - 1))) {
            trimmedWord.deleteCharAt(trimedWord.length() - 1);
        }
        return trimmedWord.toString();
    }

    public static boolean isWhitespace(String word) {
        for (char c : word.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testIsWhitespace() {
        // Given
        String whitespaceString = "   ";
        String notWhitespaceString = "Hello World";

        // When
        boolean isWhitespaceResult1 = WordWrap.isWhitespace(whitespaceString);
        boolean isWhitespaceResult2 = WordWrap.isWhitespace(notWhitespaceString);

        // Then
        Preconditions.assertTrue(isWhitespaceResult1);
        Preconditions.assertFalse(isWhitespaceResult2);
    }

}