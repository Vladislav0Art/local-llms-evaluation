package org.jsoup.nodes;

public class GeneratedNodeNameReturnsCorrectName {

    @Test
    public void nodeNameReturnsCorrectName() {
        // Given
        TextNode textNode = new TextNode("example");

        // When
        String nodeName = textNode.nodeName();

        // Then
        assertEquals("text", nodeName);
    }

}