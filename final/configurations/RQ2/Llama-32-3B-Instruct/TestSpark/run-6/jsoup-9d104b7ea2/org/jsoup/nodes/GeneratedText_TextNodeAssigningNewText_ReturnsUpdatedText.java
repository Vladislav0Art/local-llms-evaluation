package org.jsoup.nodes;

public class GeneratedText_TextNodeAssigningNewText_ReturnsUpdatedText {

    @Test
    public void text_TextNodeAssigningNewText_ReturnsUpdatedText() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String updatedText = "New Text";

        // Then
        textNode.text(updatedText);

        assertEquals(updatedText, textNode.text());
    }

}