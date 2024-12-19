package org.jsoup.nodes;

public class GeneratedTestSplitTextWithOffsetFromStart {

    @Test
    public void testSplitTextWithOffsetFromStart() {
        // Arrange
        String text = "Hello World!";
        TextNode rootNode = new TextNode(text);

        // Act
        TextNode result1 = rootNode.splitText(0);
        TextNode result2 = rootNode.splitText(-1);

        // Assert
        assertTrue(result1.text().isEmpty(), "Expected splitText from start to return a blank node");
        assertFalse(result2.text().isEmpty(), "Expected splitText from start to not be empty");
    }

}