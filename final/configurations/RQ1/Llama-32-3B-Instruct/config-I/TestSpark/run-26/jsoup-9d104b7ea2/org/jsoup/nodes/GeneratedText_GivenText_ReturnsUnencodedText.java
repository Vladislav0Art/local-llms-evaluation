package org.jsoup.nodes;

public class GeneratedText_GivenText_ReturnsUnencodedText {

    @Test
    public void text_GivenText_ReturnsUnencodedText() {
        // Given
        String text = "Hello World";

        // When
        TextNode textNode = new TextNode(text);

        // Then
        assertEquals("Hello World", textNode.text());
    }

}