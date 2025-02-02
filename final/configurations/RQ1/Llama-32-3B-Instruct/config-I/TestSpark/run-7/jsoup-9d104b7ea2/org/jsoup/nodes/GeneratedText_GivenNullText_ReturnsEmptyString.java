package org.jsoup.nodes;

public class GeneratedText_GivenNullText_ReturnsEmptyString {

    @Test
    public void text_GivenNullText_ReturnsEmptyString() {
        // Given
        TextNode textNode = new TextNode(null);

        // When
        String unencodedText = textNode.text();

        // Then
        assertTrue(unencodedText.isEmpty());
    }

}