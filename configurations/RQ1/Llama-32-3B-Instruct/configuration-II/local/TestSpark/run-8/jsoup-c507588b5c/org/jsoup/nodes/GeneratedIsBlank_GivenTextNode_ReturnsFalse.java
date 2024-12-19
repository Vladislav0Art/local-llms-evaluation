package org.jsoup.nodes;

public class GeneratedIsBlank_GivenTextNode_ReturnsFalse {

    @Test
    public void isBlank_GivenTextNode_ReturnsFalse() {
        // Arrange & Act
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        boolean result = textNode.isBlank();

        // Assert
        assertFalse(result);
    }

}