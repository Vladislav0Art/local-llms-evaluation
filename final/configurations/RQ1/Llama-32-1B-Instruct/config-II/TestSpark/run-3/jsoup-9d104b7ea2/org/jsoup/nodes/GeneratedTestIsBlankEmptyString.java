package org.jsoup.nodes;

public class GeneratedTestIsBlankEmptyString {

    @Test
    public void testIsBlankEmptyString() {
        // Arrange
        String text = "";

        // Act
        boolean result = TextNode.isBlank(text);

        // Assert
        assertTrue(result, "Expected true if the document is empty or only whitespace.");
    }

}