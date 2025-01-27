package org.jsoup.nodes;

public class GeneratedIsBlankTextNode_GivenValidText_ReturnsFalse {

    @Test
    public void isBlankTextNode_GivenValidText_ReturnsFalse() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        boolean isBlank = textNode.isBlank();

        // Assert
        assertFalse(isBlank);
    }

}