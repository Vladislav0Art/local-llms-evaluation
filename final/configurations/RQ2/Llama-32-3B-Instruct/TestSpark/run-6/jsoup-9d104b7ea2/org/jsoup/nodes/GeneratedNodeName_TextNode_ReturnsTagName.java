package org.jsoup.nodes;

public class GeneratedNodeName_TextNode_ReturnsTagName {

    @Test
    public void nodeName_TextNode_ReturnsTagName() {
        // Given
        TextNode textNode = new TextNode("tagName");

        // When
        String nodeName = textNode.nodeName();

        // Then
        assertEquals("tagName", nodeName);
    }

}