package org.jsoup.nodes;

public class GeneratedSplitTextAtOffsetReturnsCorrectTextNode {

    @Test
    public void splitTextAtOffsetReturnsCorrectTextNode() {
        // Arrange
        String text = "Hello World";
        int offset = 7;
        TextNode node = new TextNode(text);

        // Act & Assert
        assertSame(node, node.splitText(offset).text());
    }

}