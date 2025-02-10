package org.jsoup.nodes;

public class GeneratedTestIsBlankNoWhitespace {

    @Test
    public void testIsBlankNoWhitespace() {
        // Arrange
        String text = "This is a sample string.";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertFalse(result, "Expected false if the document contains any text content.");
    }

}