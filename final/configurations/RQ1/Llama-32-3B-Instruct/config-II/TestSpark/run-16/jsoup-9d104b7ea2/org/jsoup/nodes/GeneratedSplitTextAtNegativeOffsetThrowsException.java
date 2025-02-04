package org.jsoup.nodes;

public class GeneratedSplitTextAtNegativeOffsetThrowsException {

    @Test
    public void splitTextAtNegativeOffsetThrowsException() {
        // Arrange
        String text = "Hello World";
        int offset = -1;
        TextNode node = new TextNode(text);

        // Act
        node.splitText(offset);
    }

}