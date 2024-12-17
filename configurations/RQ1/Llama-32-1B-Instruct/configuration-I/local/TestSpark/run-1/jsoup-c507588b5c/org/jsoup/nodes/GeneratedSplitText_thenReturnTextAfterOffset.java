package org.jsoup.nodes;

public class GeneratedSplitText_thenReturnTextAfterOffset {

    @Test
    public void splitText_thenReturnTextAfterOffset() {
        // Arrange
        String text = "Hello World";
        int offset = 5;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertEquals("Hello World", result.text());
    }

}