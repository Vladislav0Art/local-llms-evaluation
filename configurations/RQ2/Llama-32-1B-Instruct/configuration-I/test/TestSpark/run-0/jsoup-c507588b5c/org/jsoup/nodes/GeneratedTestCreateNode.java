package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestCreateNode {

    private String text;
    private int id;

    public Node(String text) {
        this.text = text;
        this.id = 0;
    }

    @Test
    public void testCreateNode() {
        Node node = createNode("Hello, World!");
        assertEquals(node, node.getText());
    }

}