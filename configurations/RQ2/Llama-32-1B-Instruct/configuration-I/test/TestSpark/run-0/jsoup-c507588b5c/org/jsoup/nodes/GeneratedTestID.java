package org.jsoup.nodes;

import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestID {

    private String text;
    private int id;

    public Node(String text) {
        this.text = text;
        this.id = 0;
    }

    public String getText() {
        return this.text;
    }

    public int getId() {
        return this.id;
    }

    public static Node createNode(String text) {
        return new Node(text);
    }
}

public class Main {

    @Test
    public void testID() {
        Node node = createNode("Hello, World!");
        assertEquals(1234, node.getId());
    }

}