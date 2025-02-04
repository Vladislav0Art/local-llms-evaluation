package org.jsoup.nodes;

public class GeneratedSplitTextAtOffsetGreaterThanLengthThrowsException {

    @Test
    public void splitTextAtOffsetGreaterThanLengthThrowsException() {
        // Arrange
        String text = "Hello World";
        int offset = 10;
        TextNode node = new TextNode(text);

        // Act
        node.splitText(offset);
    }

}