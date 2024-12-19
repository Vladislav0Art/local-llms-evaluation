package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Arrange
        String text = "Hello World!";
        TextNode rootNode = new TextNode(text);

        // Act
        TextNode node = rootNode.splitText(8);

        // Assert
        assertTrue(node.text().isEmpty(), "Expected splitText to return a blank node");
    }

}