package org.jsoup.nodes;

public class GeneratedTextTextNode_GivenTextSetOnNode_ReturnsCorrectText {

    @Test
    public void textTextNode_GivenTextSetOnNode_ReturnsCorrectText() {
        // Arrange
        TextNode textNode = new TextNode();
        textNode.text("test");

        // Act
        String text = textNode.text();

        // Assert
        assertEquals("test", text);
    }

}