package org.jsoup.nodes;

public class GeneratedIsBlankReturnsCorrectBooleanValue {

    @Test
    public void isBlankReturnsCorrectBooleanValue() {
        // Arrange
        String text = "\t\t";
        TextNode node = new TextNode(text);

        // Act & Assert
        assertTrue(node.isBlank());
    }

}