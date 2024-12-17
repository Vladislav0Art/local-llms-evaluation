package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_thenReturnTrue {

    @Test
    public void lastCharIsWhitespace_thenReturnTrue() {
        // Arrange
        String text = "Hello World";

        // Act
        boolean result = TextNode.lastCharIsWhitespace(text);

        // Assert
        assertTrue(result);
    }

}