package org.jsoup.nodes;

public class GeneratedText_BlankString_ReturnsBlankText {

    @Test
    public void text_BlankString_ReturnsBlankText() {
        // Arrange & Act
        TextNode node = new TextNode("");
        String text = node.text();

        // Assert
        assertTrue(text.isEmpty());
    }

}