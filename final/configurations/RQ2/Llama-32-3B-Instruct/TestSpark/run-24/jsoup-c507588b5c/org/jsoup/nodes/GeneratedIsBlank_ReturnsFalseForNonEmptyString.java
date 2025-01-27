package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsFalseForNonEmptyString {

    @Test
    public void isBlank_ReturnsFalseForNonEmptyString() {
        // Given
        TextNode node = new TextNode("Hello World");

        // When
        boolean result = node.isBlank();

        // Then
        assertFalse(result);
    }

}