package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello World!");
        TextNode node2 = node1.clone();
        assertTrue(node1 == node2);
    }

}