package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedToggleClass {

    @Test
    public void toggleClass() {
        Node node = new Node("node1", "class1");
        boolean hasClassBefore = node.hasClass("class1");
        node.toggleClass("class1");
        boolean hasClassAfter = node.hasClass("class1");
        assertEquals(true, hasClassAfter);
        assertTrue(hasClassBefore);
    }
}

// Node class implementation

public abstract class Node {

    public String text;
    public String className;

    public Node(String text, String className) {
        this.text = text;
        this.className = className;
    }

    public abstract boolean hasClass(String attr);

    public void addAttr(String attr) {
        // implement logic to add attribute
    }

    public void removeAttr(String attr) {
        // implement logic to remove attribute
    }
}

// NodeList class implementation

public class NodeList {

    private List<Node> nodes;

    public NodeList(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String text() {
        return nodes.stream().map(Node::text).collect(String.join(", ", Arrays.asList()));
    }

    public void clearAttributes() {
        for (Node node : nodes) {
            node.removeAttr("class");
        }
    }
}

// Node class implementation with methods

public abstract class Node {

    private String text;
    private String className;

    public Node(String text, String className) {
        this.text = text;
        this.className = className;
    }

    @Override
    public boolean hasClass(String attr) {
        return Arrays.asList(className).contains(attr);
    }

    public void addAttr(String attr) {
        this.text += " " + attr;
    }

    public void removeAttr(String attr) {
        if (Arrays.asList(className).contains(attr)) {
            text = text.replaceFirst(" " + attr, "");
        }
    }
}

// NodeList class implementation with methods

public class NodeList {

    private List<Node> nodes;

    public NodeList(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String text() {
        return nodes.stream().map(Node::text).collect(String.join(", ", Arrays.asList()));
    }

    public void clearAttributes() {
        for (Node node : nodes) {
            node.removeAttr("class");
        }
    }
}

// Node class implementation with methods

public abstract class Node {

    private String text;
    private String className;

    public Node(String text, String className) {
        this.text = text;
        this.className = className;
    }

    @Override
    public boolean hasClass(String attr) {
        return Arrays.asList(className).contains(attr);
    }
}

// NodeList class implementation with methods

public class NodeList {

    private List<Node> nodes;

    public NodeList(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String text() {
        return nodes.stream().map(Node::text).collect(String.join(", ", Arrays.asList()));
    }

    public void clearAttributes() {
        for (Node node : nodes) {
            if (!node.getClass().getName().equals("java.lang.String")) {
                node.removeAttr("class");
            }
        }
    }

}