package org.jsoup.nodes;

public class GeneratedSplitTextAtOffsetReturnsCorrectNodeWhenOffsetIsZero {

    @Test
    public void splitTextAtOffsetReturnsCorrectNodeWhenOffsetIsZero() {
        // Arrange
        String text = "Hello World";
        int offset = 0;
        TextNode node = new TextNode(text);

        // Act & Assert
        assertSame(node, node.splitText(offset).text());
    }

}