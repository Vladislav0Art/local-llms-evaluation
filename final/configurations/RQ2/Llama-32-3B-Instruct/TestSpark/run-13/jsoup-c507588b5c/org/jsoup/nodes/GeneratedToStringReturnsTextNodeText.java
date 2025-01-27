package org.jsoup.nodes;

public class GeneratedToStringReturnsTextNodeText {

    @Test
    public void toStringReturnsTextNodeText() {
        // Given
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // When
        String toStringValue = textNode.toString();

        // Then
        assertEquals(text, toStringValue);
    }

}