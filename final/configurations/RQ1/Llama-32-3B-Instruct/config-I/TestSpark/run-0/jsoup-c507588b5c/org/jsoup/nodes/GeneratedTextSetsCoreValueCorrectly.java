package org.jsoup.nodes;

public class GeneratedTextSetsCoreValueCorrectly {

    @Test
    public void textSetsCoreValueCorrectly() {
        // Arrange
        String text = "Hello World";

        // Act
        TextNode textNode = new TextNode(text);
        textNode.text(text);

        // Assert
        assertEquals(text, textNode.coreValue());
    }

}