package org.jsoup.nodes;

public class GeneratedTestSplitTextWithNonBlankOffset {

    @Test
    public void testSplitTextWithNonBlankOffset() {
        // Arrange
        String text = "Hello World!";
        TextNode rootNode = new TextNode(text);

        // Act
        TextNode result1 = rootNode.splitText(10);
        TextNode result2 = rootNode.splitText(17);

        // Assert
        assertTrue(result1.text().isEmpty(), "Expected splitText with non-blank offset to return a blank node");
        assertFalse(result2.text().isEmpty(), "Expected splitText with non-blank offset to not be empty");
    }

}