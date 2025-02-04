package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsFalseWhenTextContainsData {

    @Test
    public void isBlank_ReturnsFalseWhenTextContainsData() {
        // Given
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // Then
        assertFalse(textNode.isBlank());
    }

}