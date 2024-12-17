package org.jsoup.nodes;

public class GeneratedClone {

    @Test
    public void clone() {
        TextNode node = new TextNode("   ");
        TextNode clonedNode = (TextNode) node.clone();
        assertNotNull(clonedNode);
        assertEquals(node, clonedNode);
    }

}