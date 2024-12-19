package org.jsoup.nodes;

public class GeneratedTestIsBlank_NullText {

    @Test
    public void testIsBlank_NullText() {
        // Arrange
        String text = null;

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertFalse(result, "Expected isBlank() to return false for a null string");
    }

}