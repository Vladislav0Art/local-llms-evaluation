package org.jsoup.nodes;

public class GeneratedTest clone {

    @Test
    public void test

    clone() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = node1.clone();
        assertNotSame(node1, node2);
    }

}