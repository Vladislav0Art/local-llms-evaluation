package org.jsoup.nodes;

public class GeneratedToString_TextNode_ReturnsTextContent {

    @Test
    public void toString_TextNode_ReturnsTextContent() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String toString = textNode.toString();

        // Then
        assertNotNull(toString);
        assertEquals("Hello World", toString);
    }

}