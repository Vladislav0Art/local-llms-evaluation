package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Arrange
        String text = "Hello World";

        // Act
        org.jsoup.nodes.TextNode textNode = new org.jsoup.nodes.TextNode(text);
        TextNode splitTextNode = textNode.splitText(7);

        // Assert
        assertTrue(splitTextNode.text().length() == 7 && splitTextNode.text().contains("World"));
    }

}