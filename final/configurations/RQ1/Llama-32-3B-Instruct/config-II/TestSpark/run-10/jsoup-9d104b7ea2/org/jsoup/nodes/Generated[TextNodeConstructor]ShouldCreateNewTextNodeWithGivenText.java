package org.jsoup.nodes;

public class Generated[TextNodeConstructor]

ShouldCreateNewTextNodeWithGivenText {

    @Test
    public void [TextNodeConstructor]ShouldCreateNewTextNodeWithGivenText() {
        // Arrange
        String expectedText = "Hello World";

        // Act
        TextNode textNode = new TextNode(expectedText);

        // Assert
        assertEquals(expectedText, textNode.text());
    }

}