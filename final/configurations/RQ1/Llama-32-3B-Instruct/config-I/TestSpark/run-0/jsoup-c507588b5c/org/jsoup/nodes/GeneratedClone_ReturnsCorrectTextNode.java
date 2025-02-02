package org.jsoup.nodes;

public class GeneratedClone_ReturnsCorrectTextNode {

    @Test
    public void clone_ReturnsCorrectTextNode() {
        // Arrange
        TextNode textNode = new TextNode("Hello World");

        // Act
        TextNode clonedTextNode = textNode.clone();

        // Assert
        assertEquals(textNode.value, clonedTextNode.value);
    }

}