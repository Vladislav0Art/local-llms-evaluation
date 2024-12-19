package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node = new TextNode("   ");
        TextNode cloned = (TextNode) node.clone();
        assertEquals(node, cloned);
    }

}