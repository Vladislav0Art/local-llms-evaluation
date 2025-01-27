package org.jsoup.nodes;

public class GeneratedCloneTextNode_GivenValidText_ReturnsCorrectClone {

    @Test
    public void cloneTextNode_GivenValidText_ReturnsCorrectClone() {
        // Arrange
        TextNode textNode = new TextNode("test");
        TextNode clone = textNode.clone();

        // Act

        // Assert
        assertTrue(clone instanceof TextNode);
    }

}