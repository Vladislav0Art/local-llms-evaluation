package org.jsoup.nodes;

public class GeneratedTestSplitTextWithOffsetFromEnd {

    @Test
    public void testSplitTextWithOffsetFromEnd() {
        // Arrange
        String text = "Hello World!";
        TextNode rootNode = new TextNode(text);

        // Act
        TextNode result1 = rootNode.splitText(text.length() - 8);
        TextNode result2 = rootNode.splitText(-1);

        // Assert
        assertTrue(result1.text().isEmpty(), "Expected splitText from end to return a blank node");
        assertFalse(result2.text().isEmpty(), "Expected splitText from end to not be empty");
    }

}