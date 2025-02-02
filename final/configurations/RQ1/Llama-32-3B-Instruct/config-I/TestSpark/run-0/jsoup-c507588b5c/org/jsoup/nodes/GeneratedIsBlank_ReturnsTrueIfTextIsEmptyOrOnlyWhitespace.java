package org.jsoup.nodes;

public class GeneratedIsBlank_ReturnsTrueIfTextIsEmptyOrOnlyWhitespace {

    @Test
    public void isBlank_ReturnsTrueIfTextIsEmptyOrOnlyWhitespace() {
        // Arrange
        TextNode textNode = new TextNode("");

        // Act
        boolean isEmpty = textNode.isBlank();

        // Assert
        assertTrue(isEmpty);

        // Arrange
        textNode = new TextNode("   ");

        // Act
        boolean isBlank = textNode.isBlank();

        // Assert
        assertTrue(isBlank);
    }

}