package org.jsoup.nodes;

public class GeneratedTestIsBlank_HighLineDots {

    @Test
    public void testIsBlank_HighLineDots() {
        // Arrange
        String text = ".";
        char[] whitespace = {' ', '\n', '\t'};

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result, "Expected isBlank() to return true for a string with high line dots");
    }

}