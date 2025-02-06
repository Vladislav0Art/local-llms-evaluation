package org.jsoup.nodes;

public class GeneratedGetWholeText_EmptyTextNodeReturnsEmptyString {

    @Test
    public void getWholeText_EmptyTextNodeReturnsEmptyString() {
        // Arrange
        TextNode node = new TextNode();

        // Act
        String actual = node.getWholeText();

        // Assert
        assertTrue(actual.isEmpty());
    }

}