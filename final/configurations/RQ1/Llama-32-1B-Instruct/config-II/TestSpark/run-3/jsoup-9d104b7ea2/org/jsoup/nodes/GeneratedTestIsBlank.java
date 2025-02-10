package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        // Arrange
        String text = "   Hello World!   ";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result, "Expected true if the document is empty or only whitespace.");
    }

}