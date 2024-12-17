package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        // Arrange
        String text = "Hello World";

        // Act
        org.jsoup.nodes.TextNode textNode = new org.jsoup.nodes.TextNode(text);

        // Assert
        assertEquals("Hello World", textNode.toString());
    }

}