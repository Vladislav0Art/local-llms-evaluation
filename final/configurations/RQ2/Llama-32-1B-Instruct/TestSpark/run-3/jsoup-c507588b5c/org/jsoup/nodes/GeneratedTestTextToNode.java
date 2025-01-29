package org.jsoup.nodes;

public class GeneratedTestTextToNode {

    @Test
    public void testTextToNode() {
        // Arrange
        String text = "Hello, World!";
        LeafNode leafNode = new LeafNode();

        // Act
        TextNode textNode = new TextNode(text);
        assertEquals(leafNode, textNode);

        // Assert
        assertNotNull(textNode.nodeName());
    }

}