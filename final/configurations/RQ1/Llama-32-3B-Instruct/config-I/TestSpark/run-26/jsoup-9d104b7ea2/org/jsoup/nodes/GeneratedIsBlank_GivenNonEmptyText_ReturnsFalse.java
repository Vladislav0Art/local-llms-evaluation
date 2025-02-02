package org.jsoup.nodes;

public class GeneratedIsBlank_GivenNonEmptyText_ReturnsFalse {

    @Test
    public void isBlank_GivenNonEmptyText_ReturnsFalse() {
        // Given
        String text = "Hello World";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertFalse(textNode.isBlank());
    }

}