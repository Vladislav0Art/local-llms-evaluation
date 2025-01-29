package org.jsoup.nodes;

public class GeneratedClone_returns_clone {

    @Test
    public void clone_returns_clone() throws Exception {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

}