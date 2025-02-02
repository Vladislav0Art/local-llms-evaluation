package org.jsoup.nodes;

public class GeneratedText_GivenEmptyString_ReturnsEmptyString {

    @Test
    public void text_GivenEmptyString_ReturnsEmptyString() {
        // Given
        String text = "";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertEquals("", textNode.text());
    }

}