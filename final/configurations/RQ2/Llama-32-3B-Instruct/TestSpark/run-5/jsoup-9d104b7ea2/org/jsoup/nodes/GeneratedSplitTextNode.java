package org.jsoup.nodes;

public class GeneratedSplitTextNode {

    private String value;

    protected Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class TextNode extends Node {
    public TextNode(String value) {
        super(value);
    }
}

public class Element {
    private Node child;

    public void appendTextNode(Node child) {
        this.child = child;
    }

    public Node getChild() {
        return child;
    }
}

public class Document {
    public Element createElement(String name) {
        Element element = new Element();
        return element;
    }

    public void appendChild(Element parent, Element child) {
        parent.appendTextNode(child);
    }
}

public class GeneratedTest {

    @Test
    public void splitTextNode() {
        TextNode node = new TextNode("textToSplit");
        String[] result = node.splitText(5);
        assertEquals("textToSpl", result[0]);
        assertEquals("", result[1]);
    }

}