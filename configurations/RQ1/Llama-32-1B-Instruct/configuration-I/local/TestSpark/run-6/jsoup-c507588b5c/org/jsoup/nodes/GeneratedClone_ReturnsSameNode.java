package org.jsoup.nodes;

public class GeneratedClone_ReturnsSameNode {

    @Test
    public void clone_ReturnsSameNode() {
        // Arrange
        TextNode textNode = new TextNode("hello");

        // Act
        TextNode clonedNode = textNode.clone();

        // Assert
        assertEquals(textNode, clonedNode);
    }

}