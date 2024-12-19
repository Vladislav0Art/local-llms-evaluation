package org.jsoup.nodes;

public class GeneratedTestIsBlankWithNonWhitespaceText {

    @Test
    public void testIsBlankWithNonWhitespaceText() {
        // Arrange
        String text = "Hello World!";
        TextNode rootNode = new TextNode(text);

        // Act
        boolean result = rootNode.isBlank();

        // Assert
        assertFalse(result, "Expected isBlank to return false");
    }

}