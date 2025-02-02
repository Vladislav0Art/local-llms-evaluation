package org.jsoup.nodes;

public class GeneratedIsBlank_GivenValidText_ReturnsFalse {

    @Test
    public void isBlank_GivenValidText_ReturnsFalse() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        boolean blank = textNode.isBlank();

        // Then
        assertFalse(blank);
    }

}