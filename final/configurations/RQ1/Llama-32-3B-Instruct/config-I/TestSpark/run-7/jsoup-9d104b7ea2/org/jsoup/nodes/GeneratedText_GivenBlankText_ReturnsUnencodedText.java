package org.jsoup.nodes;

public class GeneratedText_GivenBlankText_ReturnsUnencodedText {

    @Test
    public void text_GivenBlankText_ReturnsUnencodedText() {
        // Given
        TextNode textNode = new TextNode("");

        // When
        String unencodedText = textNode.text();

        // Then
        assertEquals("", unencodedText);
    }

}