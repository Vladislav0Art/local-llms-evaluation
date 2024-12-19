package org.jsoup.nodes;

public class GeneratedTestSplitText_DividedString {

    @Test
    public void testSplitText_DividedString() {
        // Arrange
        String text = "hello world";
        int offset = 7;

        // Act
        TextNode result = TextNode.splitText(offset);

        // Assert
        assertTrue(result.value().trim().isEmpty(), "Expected splitText(7) to return an empty string");
    }

}