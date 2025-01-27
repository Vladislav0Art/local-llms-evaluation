package org.jsoup.nodes;

public class GeneratedText_NonBlankString_ReturnsNonBlankText {

    @Test
    public void text_NonBlankString_ReturnsNonBlankText() {
        // Arrange & Act
        TextNode node = new TextNode("   ");
        String text = node.text();

        // Assert
        assertFalse(text.isEmpty());
    }

}