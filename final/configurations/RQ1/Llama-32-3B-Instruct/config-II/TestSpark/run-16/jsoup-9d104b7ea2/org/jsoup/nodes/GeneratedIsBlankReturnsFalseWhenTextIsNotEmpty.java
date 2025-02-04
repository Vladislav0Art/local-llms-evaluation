package org.jsoup.nodes;

public class GeneratedIsBlankReturnsFalseWhenTextIsNotEmpty {

    @Test
    public void isBlankReturnsFalseWhenTextIsNotEmpty() {
        // Arrange
        String text = "Hello World";
        TextNode node = new TextNode(text);

        // Act & Assert
        assertFalse(node.isBlank());
    }

}