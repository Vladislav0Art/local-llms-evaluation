package org.jsoup.nodes;

public class GeneratedIsBlank_NonBlankTextNodeReturnsExpectedValue {

    @Test
    public void isBlank_NonBlankTextNodeReturnsExpectedValue() {
        // Arrange
        TextNode node = new TextNode("test");

        // Act
        boolean actual = node.isBlank();

        // Assert
        assertFalse(actual);
    }

}