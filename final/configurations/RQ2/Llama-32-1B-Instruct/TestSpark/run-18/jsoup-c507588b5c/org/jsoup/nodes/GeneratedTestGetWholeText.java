package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        // Arrange
        String expected = "Hello World";
        String text = "Hello World";
        org.jsoup.nodes.TextNode node = new TextNode(text);

        // Act
        String wholeText = node.getWholeText();

        // Assert
        assertEquals(expected, wholeText);
    }

}