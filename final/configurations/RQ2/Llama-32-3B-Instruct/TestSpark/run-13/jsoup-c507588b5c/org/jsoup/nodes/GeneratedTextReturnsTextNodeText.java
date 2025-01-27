package org.jsoup.nodes;

public class GeneratedTextReturnsTextNodeText {

    @Test
    public void textReturnsTextNodeText() {
        // Given
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // When
        String textValue = textNode.text();

        // Then
        assertEquals(text, textValue);
    }

}