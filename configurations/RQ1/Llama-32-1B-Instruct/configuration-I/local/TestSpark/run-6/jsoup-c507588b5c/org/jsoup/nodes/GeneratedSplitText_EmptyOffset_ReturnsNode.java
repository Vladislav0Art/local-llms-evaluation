package org.jsoup.nodes;

public class GeneratedSplitText_EmptyOffset_ReturnsNode {

    @Test
    public void splitText_EmptyOffset_ReturnsNode() {
        // Arrange
        String encodedText = "";
        int offset = 0;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertNotNull(result);
    }

}