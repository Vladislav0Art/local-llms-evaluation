package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetID {

    private String text;
    private int id;

    public Node(String text) {
        this.text = text;
        this.id = 0;
    }

    @Test
    public void testGetID() {
        Node node = createNode("Hello, World!");
        assertEquals(1234, node.getId());
    }

}