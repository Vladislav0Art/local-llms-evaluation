package org.jsoup.nodes;

public class GeneratedText_GivenValidText_ReturnsUnencodedText {

    @Test
    public void text_GivenValidText_ReturnsUnencodedText() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String unencodedText = textNode.text();

        // Then
        assertEquals("Hello World", unencodedText);
    }

}