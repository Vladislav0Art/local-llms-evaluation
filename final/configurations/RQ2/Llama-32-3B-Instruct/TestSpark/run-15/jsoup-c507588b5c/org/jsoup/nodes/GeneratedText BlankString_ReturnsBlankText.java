package org.jsoup.nodes;

public class GeneratedText BlankString_ReturnsBlankText {

    @Test
    public void text

    BlankString_ReturnsBlankText() {
        // Arrange & Act
        TextNode node = new TextNode("");
        String text = node.text();

        // Assert
        assertTrue(text.isEmpty());
    }

}