package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespaceStringBuilder_GivenNonEmptyStringBuilder_ReturnsFalse {

    @Test
    public void lastCharIsWhitespaceStringBuilder_GivenNonEmptyStringBuilder_ReturnsFalse() {
        // Arrange
        StringBuilder sb = new StringBuilder("test");

        // Act
        boolean isLastCharWhitespace = TextNode.lastCharIsWhitespace(sb);

        // Assert
        assertFalse(isLastCharWhitespace);
    }

}