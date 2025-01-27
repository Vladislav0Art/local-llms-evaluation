package org.jsoup.nodes;

public class GeneratedGetWholeText_TextNode_ReturnsTextContent {

    @Test
    public void getWholeText_TextNode_ReturnsTextContent() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String wholeText = textNode.getWholeText();

        // Then
        assertNotNull(wholeText);
        assertEquals("Hello World", wholeText);
    }

}