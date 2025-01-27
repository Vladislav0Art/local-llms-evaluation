package org.jsoup.nodes;

public class GeneratedText_AnyText_ReturnsCorrectText {

    @Test
    public void text_AnyText_ReturnsCorrectText() {
        // Arrange & Act
        TextNode node = new TextNode("Hello, World!");
        String text = node.text();

        // Assert
        assertEquals("Hello, World!", text);
    }

}