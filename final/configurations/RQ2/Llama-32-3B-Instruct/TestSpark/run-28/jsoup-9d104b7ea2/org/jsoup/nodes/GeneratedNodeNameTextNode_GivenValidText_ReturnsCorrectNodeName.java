package org.jsoup.nodes;

public class GeneratedNodeNameTextNode_GivenValidText_ReturnsCorrectNodeName {

    @Test
    public void nodeNameTextNode_GivenValidText_ReturnsCorrectNodeName() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String nodeName = textNode.nodeName();

        // Assert
        assertEquals("text", nodeName);
    }

}