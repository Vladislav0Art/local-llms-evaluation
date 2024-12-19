package org.jsoup.nodes;

public class GeneratedText_GivenTextNode_ReturnsText {

    @Test
    public void text_GivenTextNode_ReturnsText() {
        // Arrange & Act
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        String result = textNode.text();

        // Assert
        assertEquals(text, result);
    }

}