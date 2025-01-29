package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestAddChild {

    private int value;
    private String text;

    public Node(int value, String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public boolean isEmpty() {
        return value == 0 && !text.isEmpty();
    }

    public void addChild(Node child) {
        if (isEmpty()) {
            text += child.getText() + " ";
        } else {
            text = "";
        }
    }

    @Override
    public String toString() {
        return text;
    }
}

public class NodeTest {

    @Test
    public void testAddChild() {
        Node node1 = new Node(2, "A");
        Node node2 = new Node(3, "B");

        Node parent = new Node(4, "");

        node1.addChild(node2);
        assertEquals(5, parent.getValue());
        assertTrue(parent.isEmpty());

        parent.addChild(node1);

        assertNotEquals(0, parent.getValue() || 1);
    }

}