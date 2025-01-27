package org.jsoup.nodes;

public class GeneratedGetFirstChildElementAsTextNode {

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
    public void getFirstChildElementAsTextNode() {
        Document doc = new Document();
        Element parent = doc.createElement("parent");
        Element child = doc.createElement("child").appendTextNode(new TextNode("childText"));
        doc.appendChild(parent, child);
        TextNode textNode = (TextNode) ((Node) parent.getChild()).getChildNodes().get(0);
        assertEquals("childText", textNode.getValue());
    }

}