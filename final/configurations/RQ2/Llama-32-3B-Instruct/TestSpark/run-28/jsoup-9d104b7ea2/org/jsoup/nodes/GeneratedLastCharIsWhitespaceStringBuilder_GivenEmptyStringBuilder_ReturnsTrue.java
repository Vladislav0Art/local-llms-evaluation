package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespaceStringBuilder_GivenEmptyStringBuilder_ReturnsTrue {

    @Test
    public void lastCharIsWhitespaceStringBuilder_GivenEmptyStringBuilder_ReturnsTrue() {
        // Arrange
        StringBuilder sb = new StringBuilder();

        // Act
        boolean isLastCharWhitespace = TextNode.lastCharIsWhitespace(sb);

        // Assert
        assertTrue(isLastCharWhitespace);
    }

}