package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        // Arrange
        org.jsoup.nodes.TextNode node1 = new TextNode("Hello World!");
        org.jsoup.nodes.TextNode node2 = (TextNode) org.jsoup.nodes.TextNode.clone();

        // Act and Assert
        assertEquals(node1, node2);
    }

}