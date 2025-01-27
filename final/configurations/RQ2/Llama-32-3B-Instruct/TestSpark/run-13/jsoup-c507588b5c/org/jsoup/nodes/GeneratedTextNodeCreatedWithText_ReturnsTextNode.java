package org.jsoup.nodes;

public class GeneratedTextNodeCreatedWithText_ReturnsTextNode {

    @Test
    public void textNodeCreatedWithText_ReturnsTextNode() {
        // Given
        String text = "Hello World";
        TextNode textNode = new TextNode(text);

        // When
        // Then
        assertNotNull(textNode);
    }

}