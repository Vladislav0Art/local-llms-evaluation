package org.davidmoten.text.utils;

public class GeneratedTest {

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
    public void testWordWrap() {
        // Given
        String word = "Hello World";
        int maxWidth = 20;
        StringBuilder expectedTrimmedString = new StringBuilder(" Hello ");
        String expectedRightTrimmedString = "World";

        // When
        WordWrap trimmedWord = WordWrap.leftTrim(word);
        String rightTrimmedString = WordWrap.rightTrim(word);

        // Then
        Preconditions.assertTrue(WordWrap.isWhitespace(trimmedWord.toString()));
        Preconditions.assertEquals(expectedTrimmedString, trimmedWord);
        Preconditions.assertEquals(expectedRightTrimmedString, rightTrimmedString);
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

    @Test
    public void testWordWrapRightTrim() {
        // Given
        String word = "Hello World";
        int maxWidth = 20;
        StringBuilder expectedTrimmedString = new StringBuilder("World");

        // When
        WordWrap trimmedWord = WordWrap.rightTrim(word);

        // Then
        Preconditions.assertEquals(expectedTrimmedString, trimmedWord);
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

    @Test
    public void testIsWhitespaceWrongType() {
        // Given
        String whitespaceString = "   ";
        String notWhitespaceString = new StringBuilder("Hello World");

        // When
        boolean isWhitespaceResult = WordWrap.isWhitespace(notWhitespaceString);

        // Then
        Preconditions.assertFalse(isWhitespaceResult);
    }

    @Test
    public void testRightTrim() {
        // Given
        String word = "Hello World";
        int maxWidth = 20;
        StringBuilder expectedRightTrimmedString = new StringBuilder("World");

        // When
        WordWrap trimmedWord = WordWrap.rightTrim(word);

        // Then
        Preconditions.assertEquals(expectedRightTrimmedString, trimmedWord);
    }

    @Test
    public void testLeftTrimWrongType() {
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