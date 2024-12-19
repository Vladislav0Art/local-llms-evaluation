package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        // Arrange
        String text = "   ";
        TextNode rootNode = new TextNode(text);

        // Act
        boolean result = rootNode.isBlank();

        // Assert
        assertTrue(result, "Expected isBlank to return true");
    }

}