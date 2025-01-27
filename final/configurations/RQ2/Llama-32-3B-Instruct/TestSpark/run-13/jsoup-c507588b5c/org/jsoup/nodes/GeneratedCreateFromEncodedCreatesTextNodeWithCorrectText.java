package org.jsoup.nodes;

public class GeneratedCreateFromEncodedCreatesTextNodeWithCorrectText {

    @Test
    public void createFromEncodedCreatesTextNodeWithCorrectText() {
        // Given
        String encodedText = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);

        // When
        String textValue = textNode.text();

        // Then
        assertEquals(encodedText, textValue);
    }

}