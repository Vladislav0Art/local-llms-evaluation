package org.jsoup.nodes;

public class GeneratedGenerateDocumentWithTextNode {

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
    public void generateDocumentWithTextNode() {
        Document doc = new Document();
        Element element = doc.createElement("element");
        Element child = new TextNode("childText");
        doc.appendChild(element, child);
    }

}