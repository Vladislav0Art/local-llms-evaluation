package org.jsoup.nodes;

public class GeneratedTestSplitText_SingleWhitespace {

    @Test
    public void testSplitText_SingleWhitespace() {
        // Arrange
        String text = "  ";
        int offset = 0;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertTrue(result.value().trim().isEmpty(), "Expected splitText(0) to return an empty string");
    }

}