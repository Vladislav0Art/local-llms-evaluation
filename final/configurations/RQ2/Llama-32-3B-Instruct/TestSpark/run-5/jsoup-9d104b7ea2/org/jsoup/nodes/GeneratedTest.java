package org.jsoup.nodes;

public class GeneratedTest {

    private String value;

    public Node(String value) {
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
    public static Element createElement(String name) {
        Element element = new Element();
        return element;
    }

    public static void appendChild(Element parent, Element child) {
        parent.appendTextNode(child);
    }
}

public class GeneratedTest {

    @Test
    public void nodeNameIsNode() {
        TextNode node = new TextNode("text");
        assertEquals("node", node.nodeName());
    }

    @Test
    public void textReturnsTextContent() {
        TextNode node = new TextNode("text");
        assertEquals("text", node.text());
    }

    @Test
    public void isBlankReturnsFalseForNonEmptyText() {
        TextNode node = new TextNode("text");
        assertFalse(node.isBlank());
    }

    @Test
    public void isBlankReturnsTrueForEmptyText() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void toStringIncludesHtmlTagAndTextContent() {
        String expectedOutput = "<node>text</node>";
        TextNode node = new TextNode("text");
        assertEquals(expectedOutput, node.toString());
    }

    @Test
    public void createFromEncodedCreatesTextNodeWithEncodedText() {
        String encodedText = "encodedText";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, node.text());
    }

}