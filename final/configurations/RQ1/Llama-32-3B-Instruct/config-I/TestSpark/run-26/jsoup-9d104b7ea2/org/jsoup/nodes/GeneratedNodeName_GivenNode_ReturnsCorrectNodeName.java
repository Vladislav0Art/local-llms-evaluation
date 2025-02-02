package org.jsoup.nodes;

public class GeneratedNodeName_GivenNode_ReturnsCorrectNodeName {

    @Test
    public void nodeName_GivenNode_ReturnsCorrectNodeName() {
        // Given
        TextNode textNode = new TextNode("Hello World");

        // When
        String result = textNode.nodeName();

        // Then
        assertEquals("#text", result);
    }

}