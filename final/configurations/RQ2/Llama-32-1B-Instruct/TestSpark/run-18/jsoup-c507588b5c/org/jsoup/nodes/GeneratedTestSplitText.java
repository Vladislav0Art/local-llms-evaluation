package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Arrange
        int offset = 5;
        String text = "Hello World!";
        org.jsoup.nodes.TextNode node = new TextNode(text);

        // Act
        TextNode result = node.splitText(offset);

        // Assert
        assertEquals("Hello", result.text());
    }

}