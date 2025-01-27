package org.jsoup.nodes;

public class GeneratedNodeName_AlwaysReturnsText {

    @Test
    public void nodeName_AlwaysReturnsText() {
        // Given
        TextNode node = new TextNode("Hello World");

        // When
        String result = node.nodeName();

        // Then
        assertEquals("text", result);
    }

}