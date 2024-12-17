package org.jsoup.nodes;

public class GeneratedToString_thenReturnText {

    @Test
    public void toString_thenReturnText() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode result = new TextNode(text);

        // Assert
        assertEquals("Hello World", result.text());
    }

}