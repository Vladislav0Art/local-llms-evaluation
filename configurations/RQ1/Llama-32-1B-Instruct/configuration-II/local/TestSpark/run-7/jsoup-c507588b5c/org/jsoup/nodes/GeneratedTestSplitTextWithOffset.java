package org.jsoup.nodes;

public class GeneratedTestSplitTextWithOffset {

    @Test
    public void testSplitTextWithOffset() {
        // Arrange
        String text = "Hello World!";
        TextNode rootNode = new TextNode(text);

        // Act
        TextNode result1 = rootNode.splitText(10);
        TextNode result2 = rootNode.splitText(15);

        // Assert
        assertTrue(result1.text().isEmpty(), "Expected splitText with offset to return a blank node");
        assertFalse(result2.text().isEmpty(), "Expected splitText with offset to not be empty");
    }

}