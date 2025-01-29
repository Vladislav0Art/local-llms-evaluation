package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsEmpty {

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
    public void testIsEmpty() {
        Node parent = new Node(0, "");
        assertFalse(parent.isEmpty());
    }

}