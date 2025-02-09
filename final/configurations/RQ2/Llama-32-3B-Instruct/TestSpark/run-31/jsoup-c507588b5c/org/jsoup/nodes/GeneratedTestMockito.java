package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestMockito {

    public static Document getDocument() {
        return new Document();
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