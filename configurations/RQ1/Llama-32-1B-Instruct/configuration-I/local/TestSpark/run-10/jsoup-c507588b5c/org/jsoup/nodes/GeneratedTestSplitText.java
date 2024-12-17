package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Arrange
        String text = "Hello\nWorld";
        int offset = 6;

        // Act
        TextNode result1 = TextNode.splitText(offset);
        TextNode result2 = TextNode.splitText(offset + 3);

        // Assert
        assertEquals(result1, result2);
    }

}