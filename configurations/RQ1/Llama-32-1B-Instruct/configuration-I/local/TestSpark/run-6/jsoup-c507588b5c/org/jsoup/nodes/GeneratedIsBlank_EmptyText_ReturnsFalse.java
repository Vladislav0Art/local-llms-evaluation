package org.jsoup.nodes;

public class GeneratedIsBlank_EmptyText_ReturnsFalse {

    @Test
    public void isBlank_EmptyText_ReturnsFalse() {
        // Arrange
        String encodedText = "";

        // Act
        boolean result = TextNode.isBlank(encodedText);

        // Assert
        assertTrue(result);
    }

}