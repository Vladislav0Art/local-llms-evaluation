package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        // Arrange
        String text = "Hello World";

        // Act
        org.jsoup.nodes.TextNode textNode1 = new org.jsoup.nodes.TextNode(text);
        org.jsoup.nodes.TextNode textNode2 = textNode1.clone();

        // Assert
        assertTrue(textNode2.text().equals(text));
    }

}