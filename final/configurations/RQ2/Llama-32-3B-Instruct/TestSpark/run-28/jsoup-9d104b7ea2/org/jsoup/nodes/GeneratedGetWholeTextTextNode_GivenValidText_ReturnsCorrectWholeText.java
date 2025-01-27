package org.jsoup.nodes;

public class GeneratedGetWholeTextTextNode_GivenValidText_ReturnsCorrectWholeText {

    @Test
    public void getWholeTextTextNode_GivenValidText_ReturnsCorrectWholeText() {
        // Arrange
        TextNode textNode = new TextNode("test");

        // Act
        String wholeText = textNode.getWholeText();

        // Assert
        assertEquals("test", wholeText);
    }

}