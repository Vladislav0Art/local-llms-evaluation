package org.jsoup.nodes;

public class GeneratedIsBlank_BlankTextNodeReturnsExpectedValue {

    @Test
    public void isBlank_BlankTextNodeReturnsExpectedValue() {
        // Arrange
        TextNode node = new TextNameSpace("");

        // Act
        boolean actual = node.isBlank();

        // Assert
        assertTrue(actual);
    }

}