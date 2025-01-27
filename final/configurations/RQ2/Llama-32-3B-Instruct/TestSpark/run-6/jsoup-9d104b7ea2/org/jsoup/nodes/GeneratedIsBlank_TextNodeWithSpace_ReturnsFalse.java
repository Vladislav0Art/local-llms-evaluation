package org.jsoup.nodes;

public class GeneratedIsBlank_TextNodeWithSpace_ReturnsFalse {

    @Test
    public void isBlank_TextNodeWithSpace_ReturnsFalse() {
        // Given
        TextNode textNode = new TextNode("Hello");

        // When
        boolean isBlank = textNode.isBlank();

        // Then
        assertFalse(isBlank);
    }

}