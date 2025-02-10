package org.davidmoten.text.utils;

public class GeneratedTestWordWrapLeftTrim {

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
    public void testWordWrapLeftTrim() {
        // Given
        String word = "Hello World";
        int maxWidth = 20;
        StringBuilder expectedTrimmedString = new StringBuilder(" Hello ");

        // When
        WordWrap trimmedWord = WordWrap.leftTrim(word);

        // Then
        Preconditions.assertEquals(expectedTrimmedString, trimmedWord);
    }

}