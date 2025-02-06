package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_SingleCharacterStringReturnsTrue {

    @Test
    public void lastCharIsWhitespace_SingleCharacterStringReturnsTrue() {
        // Arrange
        StringBuilder sb = new StringBuilder("test");

        // Act
        boolean actual = TextNode.lastCharIsWhitespace(sb);

        // Assert
        assertTrue(actual);
    }

}