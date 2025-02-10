package org.jsoup.nodes;

public class GeneratedTestIsBlankWhitespaceOnlyString {

    @Test
    public void testIsBlankWhitespaceOnlyString() {
        // Arrange
        String text = "Hello ";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result, "Expected true if the document is empty or only whitespace.");
    }

}