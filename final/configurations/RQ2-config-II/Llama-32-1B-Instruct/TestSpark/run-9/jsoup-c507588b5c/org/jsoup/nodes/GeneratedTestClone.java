package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

}