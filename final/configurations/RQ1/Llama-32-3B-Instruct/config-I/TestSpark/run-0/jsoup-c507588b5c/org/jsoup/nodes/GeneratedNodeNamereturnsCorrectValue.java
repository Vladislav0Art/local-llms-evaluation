package org.jsoup.nodes;

public class GeneratedNodeNamereturnsCorrectValue {

    @Test
    public void nodeNamereturnsCorrectValue() {
        // Arrange
        TextNode textNode = new TextNode("");

        // Act
        String nodeName = textNode.nodeName();

        // Assert
        assertEquals("#text", nodeName);
    }

}