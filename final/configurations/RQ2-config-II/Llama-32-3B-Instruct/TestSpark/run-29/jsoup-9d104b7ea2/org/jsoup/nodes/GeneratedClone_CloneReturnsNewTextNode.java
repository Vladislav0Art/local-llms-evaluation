package org.jsoup.nodes;

public class GeneratedClone_CloneReturnsNewTextNode {

    @Test
    public void clone_CloneReturnsNewTextNode() {
        // Arrange
        TextNode node = new TextNameSpace("test");
        TextNode cloned = node.clone();

        // Act

        // Assert
        assertNotNull(cloned);
        assertEquals(node.text(), cloned.text());
    }

}