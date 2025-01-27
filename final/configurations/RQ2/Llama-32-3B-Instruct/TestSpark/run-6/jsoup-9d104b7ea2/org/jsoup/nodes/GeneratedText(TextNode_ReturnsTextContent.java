package org.jsoup.nodes;

public class GeneratedText(TextNode_ReturnsTextContent {

    @Test
    public void text(TextNode_ReturnsTextContent() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String text = textNode.text();

        // Then
        assertNotNull(text);
        assertEquals("Hello World", text);
    }

}