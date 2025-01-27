package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespaceReturnsFalseForNonWhitespaceLastCharacter {

    @Test
    public void lastCharIsWhitespaceReturnsFalseForNonWhitespaceLastCharacter() {
        // Given
        StringBuilder sb = new StringBuilder("Hello World");

        // When
        boolean result = TextNode.lastCharIsWhitespace(sb);

        // Then
        assertFalse(result);
    }

}