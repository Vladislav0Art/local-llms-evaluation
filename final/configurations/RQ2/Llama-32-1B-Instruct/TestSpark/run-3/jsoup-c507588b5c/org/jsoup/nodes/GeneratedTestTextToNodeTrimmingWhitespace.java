package org.jsoup.nodes;

public class GeneratedTestTextToNodeTrimmingWhitespace {

    @Test
    public void testTextToNodeTrimmingWhitespace() {
        // Arrange
        String text = "Hello  World!";
        LeafNode leafNode = new LeafNode();

        // Act
        TextNode textNode = new TextNode(text);
        assertEquals(leafNode, textNode);

        // Assert
        assertNotNull(textNode.nodeName());
    }

}