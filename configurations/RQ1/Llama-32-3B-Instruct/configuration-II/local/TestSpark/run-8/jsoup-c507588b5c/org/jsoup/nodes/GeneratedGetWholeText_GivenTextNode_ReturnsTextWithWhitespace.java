package org.jsoup.nodes;

public class GeneratedGetWholeText_GivenTextNode_ReturnsTextWithWhitespace {

    @Test
    public void getWholeText_GivenTextNode_ReturnsTextWithWhitespace() {
        // Arrange & Act
        String text = "   Hello World  ";
        TextNode textNode = new TextNode(text);
        String result = textNode.getWholeText();

        // Assert
        assertEquals(text, result);
    }

}