package org.jsoup.nodes;

public class Generated[TextNodeIsBlank]

ShouldReturnTrueWhenTextNodeIsEmptyOrOnlyWhitespace {

    @Test
    public void [TextNodeIsBlank]ShouldReturnTrueWhenTextNodeIsEmptyOrOnlyWhitespace() {
        // Arrange
        String expectedText = "";
        TextNode textNode = new TextNode(expectedText);

        // Act
        boolean actualResult = textNode.isBlank();

        // Assert
        assertTrue(actualResult);
    }

}