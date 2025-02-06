package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_EmptyStringBuilderReturnsFalse {

    @Test
    public void lastCharIsWhitespace_EmptyStringBuilderReturnsFalse() {
        // Arrange
        StringBuilder sb = new StringBuilder();

        // Act
        boolean actual = TextNode.lastCharIsWhitespace(sb);

        // Assert
        assertFalse(actual);
    }

}