package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestConstructor {

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
    public void testConstructor() {
        Document doc = new Document();
        Element node1 = doc.createElement("Node");
        element1.text = "New";
        node1.appendChild(doc.createTextNode("New"));
        Node child1 = new Node(0, "");
        Document document = new Document();
        document.appendChild(node1);
        document.appendChild(child1);
        Element parent = doc.createElement("Parent");
        parent.appendChild(document);
        Node parent2 = new Node(1, "Parent");
        document.appendChild(parent);
        parent.addChild(new Node(2, "Child"));
        assertEquals(3, child1.getValue());
    }

}