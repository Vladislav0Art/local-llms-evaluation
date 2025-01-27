package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_HasSingleSpace_ReturnsTrue {

    @Test
    public void lastCharIsWhitespace_HasSingleSpace_ReturnsTrue() {
        // Arrange
        StringBuilder sb = new StringBuilder(" ");
        boolean result = TextNode.lastCharIsWhitespace(sb);

        // Assert
        assertTrue(result);
    }

}