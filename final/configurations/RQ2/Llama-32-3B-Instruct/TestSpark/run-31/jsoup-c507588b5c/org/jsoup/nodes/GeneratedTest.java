package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTest {

    public static Document getDocument() {
        return new Document();
    }

    @Test
    public void testNormaliseWhitespace_SimpleTextWithNoLeadingSpaces() {
        Node node = TextNode.createNew();
        String normalisedValue = TextNode.normaliseWhitespace(node).getValue();
        assertEquals("", normalisedValue);
    }

    @Test
    public void testNormaliseWhitespace_SimpleTextWithTrailingSpaces() {
        Node node = TextNode.createNew("Hello ");
        String normalisedValue = TextNode.normaliseWhitespace(node).getValue();
        assertEquals("Hello", normalisedValue);
    }

    @Test
    public void testOuterHtmlHead() {
        Node newNode = new Node("");
        Document outputSettings = getDocument();
        String accum = "Hello World";
        String expectedOutput = "<html><head></head><body>Hello World</body></html>";
        String actualOutput = newNode.outerHtmlHead(accum, 0, outputSettings).toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testOuterHtmlTail() {
        Node newNode = new Node("");
        Document outputSettings = getDocument();
        String accum = "Hello World";
        String expectedOutput = "<html><body>Hello World</body></html>";
        String actualOutput = newNode.outerHtmlTail(accum, 0, outputSettings).toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMockito() {
        Document document = getDocument();
        OutputMode outputMode = MockitoMocker.when(OutputMode.HTML);
        // implementation
    }
}

public class Node {
    private String value;

    public static Node createNode(String value) {
        return new Node(value);
    }

    public String getValue() {
        return value;
    }
}

public class TextNode extends Node {
    private String text;

    public TextNode(String text) {
        super(text);
    }

    public static TextNode normaliseWhitespace(TextNode node) {
        if (node == null) {
            return new TextNode("");
        }
        return new TextNode(node.getValue());
    }

    public String splitText(int index) {
        if (index < 0 || index > getValue().length()) {
            throw new IndexOutOfBoundsException();
        }
        return getValue().substring(0, index);
    }

    public Document outerHtmlHead(String accum, int index, Document outputSettings) {
        // implementation
        return null;
    }

    public String outerHtmlTail(String accum, int index, Document outputSettings) {
        // implementation
        return "";
    }
}

public class OutputMode {
    public static final OutputMode HTML = new OutputMode("HTML");
    public static final OutputMode XML = new OutputMode("XML");
}

public class MockitoMocker {

    private Document document;

    public static Document mockDocument() {
        return new Document();
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public OutputMode when(OutputMode outputMode) {
        // implementation
        return null;
    }

}