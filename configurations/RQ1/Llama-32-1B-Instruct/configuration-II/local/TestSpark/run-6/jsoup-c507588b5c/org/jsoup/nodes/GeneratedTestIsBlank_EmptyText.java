package org.jsoup.nodes;

public class GeneratedTestIsBlank_EmptyText {

    @Test
    public void testIsBlank_EmptyText() {
        // Arrange
        String text = "";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result, "Expected isBlank() to return true for an empty string");
    }

}