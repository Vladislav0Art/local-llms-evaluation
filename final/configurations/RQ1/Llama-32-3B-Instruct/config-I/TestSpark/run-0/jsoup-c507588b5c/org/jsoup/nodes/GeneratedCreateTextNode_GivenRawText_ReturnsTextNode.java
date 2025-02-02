package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenRawText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenRawText_ReturnsTextNode() {
        // Arrange
        String rawText = "Hello World";

        // Act
        TextNode textNode = new TextNode(rawText);

        // Assert
        assertEquals(rawText, textNode.value);
    }

}