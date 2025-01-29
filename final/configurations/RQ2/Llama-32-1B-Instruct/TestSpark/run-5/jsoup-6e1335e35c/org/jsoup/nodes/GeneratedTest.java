package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    public static Node create(int value, String text) {
        return new Node(value, text);
    }

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

}