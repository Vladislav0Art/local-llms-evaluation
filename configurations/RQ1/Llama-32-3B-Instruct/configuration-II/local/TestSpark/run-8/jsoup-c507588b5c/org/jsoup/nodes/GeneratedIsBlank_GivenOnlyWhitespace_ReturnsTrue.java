package org.jsoup.nodes;

public class GeneratedIsBlank_GivenOnlyWhitespace_ReturnsTrue {

    @Test
    public void isBlank_GivenOnlyWhitespace_ReturnsTrue() {
        // Arrange & Act
        String text = "";
        TextNode textNode = new TextNode(text);
        boolean result = textNode.isBlank();

        // Assert
        assertTrue(result);
    }

}