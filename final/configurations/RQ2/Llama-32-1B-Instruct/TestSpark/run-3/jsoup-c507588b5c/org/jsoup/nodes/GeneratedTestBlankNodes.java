package org.jsoup.nodes;

public class GeneratedTestBlankNodes {

    @Test
    public void testBlankNodes() {
        // Arrange
        String text = "";
        LeafNode leafNode = new LeafNode();

        // Act
        TextNode textNode = new TextNode(text);
        assertEquals(leafNode, textNode);

        // Assert
        assertNotNull(textNode.nodeName());
    }

}