package org.jsoup.nodes;

public class GeneratedTestIsBlank_PunctuationCharacters {

    @Test
    public void testIsBlank_PunctuationCharacters() {
        // Arrange
        String text = ".";
        char[] whitespace = {' ', '\n', '\t'};

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result, "Expected isBlank() to return true for a string with punctuation characters");
    }

}