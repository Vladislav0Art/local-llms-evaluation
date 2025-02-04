package org.jsoup.nodes;

public class Generated[TextNodeClone]

ShouldReturnNewTextNodeWithSameContent {

    @Test
    public void [TextNodeClone]ShouldReturnNewTextNodeWithSameContent() {
        // Arrange
        String expectedText = "Hello World";
        TextNode textNode = new TextNode(expectedText);

        // Act
        TextNode actualNode = textNode.clone();

        // Assert
        assertEquals(expectedText, actualNode.text());
    }

}