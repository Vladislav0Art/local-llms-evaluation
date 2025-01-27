package org.jsoup.nodes;

public class GeneratedCreateFromEncoded_TextNode_CreatesTextNodeFromEncodedText {

    @Test
    public void createFromEncoded_TextNode_CreatesTextNodeFromEncodedText() {
        // Given
        String encodedText = "encodedText";

        // When
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // Then
        assertNotNull(textNode);
        assertEquals(encodedText, textNode.text());
    }

}