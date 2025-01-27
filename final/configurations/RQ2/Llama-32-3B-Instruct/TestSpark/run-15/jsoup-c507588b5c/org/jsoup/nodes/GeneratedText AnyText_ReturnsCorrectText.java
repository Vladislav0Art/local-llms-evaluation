package org.jsoup.nodes;

public class GeneratedText AnyText_ReturnsCorrectText {

    @Test
    public void text

    AnyText_ReturnsCorrectText() {
        // Arrange & Act
        TextNode node = new TextNode("Hello, World!");
        String text = node.text();

        // Assert
        assertEquals("Hello, World!", text);
    }

}