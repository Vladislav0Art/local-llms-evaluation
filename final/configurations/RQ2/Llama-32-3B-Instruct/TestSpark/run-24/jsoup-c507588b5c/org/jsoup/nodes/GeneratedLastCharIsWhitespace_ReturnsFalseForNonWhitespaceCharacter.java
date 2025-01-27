package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_ReturnsFalseForNonWhitespaceCharacter {

    @Test
    public void lastCharIsWhitespace_ReturnsFalseForNonWhitespaceCharacter() {
        // Given
        StringBuilder sb = new StringBuilder();
        sb.append('A');

        // When
        boolean result = TextNode.lastCharIsWhitespace(sb);

        // Then
        assertFalse(result);
    }

}