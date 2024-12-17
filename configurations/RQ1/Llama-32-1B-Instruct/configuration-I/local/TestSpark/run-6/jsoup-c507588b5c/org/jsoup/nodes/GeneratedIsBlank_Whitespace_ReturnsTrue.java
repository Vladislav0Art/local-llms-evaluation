package org.jsoup.nodes;

public class GeneratedIsBlank_Whitespace_ReturnsTrue {

    @Test
    public void isBlank_Whitespace_ReturnsTrue() {
        // Arrange
        String encodedText = "   ";

        // Act
        boolean result = TextNode.isBlank(encodedText);

        // Assert
        assertTrue(result);
    }

}