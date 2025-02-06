package org.jsoup.nodes;

public class GeneratedText_SimpleTextNodeReturnsEncodedText {

    @Test
    public void text_SimpleTextNodeReturnsEncodedText() {
        // Arrange
        TextNode node = new TextNode("test");
        String expected = "test";

        // Act
        String actual = node.text();

        // Assert
        assertEquals(expected, actual);
    }

}