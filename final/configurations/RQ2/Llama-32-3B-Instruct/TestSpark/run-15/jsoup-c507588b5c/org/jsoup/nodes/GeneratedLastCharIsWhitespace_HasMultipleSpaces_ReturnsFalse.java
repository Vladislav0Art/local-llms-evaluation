package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_HasMultipleSpaces_ReturnsFalse {

    @Test
    public void lastCharIsWhitespace_HasMultipleSpaces_ReturnsFalse() {
        // Arrange
        StringBuilder sb = new StringBuilder("   ");

        // Act & Assert
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}