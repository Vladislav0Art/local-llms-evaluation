package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        // Arrange
        String text = "Hello World!";
        org.jsoup.nodes.TextNode node = new TextNode(text);

        // Act
        String actual = node.toString();

        // Assert
        assertEquals("text", actual);
    }

}