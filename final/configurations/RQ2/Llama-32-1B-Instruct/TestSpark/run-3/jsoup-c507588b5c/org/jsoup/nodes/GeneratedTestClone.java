package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        // Arrange
        String text = "Hello, World! 123";
        LeafNode leafNode = new LeafNode();

        // Act
        TextNode clone = textNode.clone();
        assertEquals(leafNode, clone);

        // Assert
        assertNotNull(clone);
    }

}