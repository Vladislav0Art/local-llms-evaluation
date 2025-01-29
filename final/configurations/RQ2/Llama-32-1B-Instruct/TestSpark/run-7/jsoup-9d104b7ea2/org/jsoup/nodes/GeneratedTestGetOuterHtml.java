package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestGetOuterHtml {

    public String outerHtmlHead(MockDocument document, int start, int end) {
        return document.outerHtmlHead(start, end);
    }

    public String outerHtmlTail(MockDocument document, int start, int end) {
        return document.outerHtmlTail(start, end);
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Document extends java.util.ArrayList<TextNode> implements java.io.Appendable {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (TextView textNode : this) {
            sb.append(textNode.outerHtmlHead(this, 0, null).toString()).append("\n");
        }
        return sb.toString();
    }

    public Appendable appendText(String content) {
        add(new TextNode(content));
        return this;
    }

    @Override
    public void append(TextView textNode) throws Exception {
        if (textNode instanceof Appendable) {
            ((Appendable) textNode).append(this);
        } else {
            outerHtmlHead(this, 0, null).append((Appendable) textNode);
        }
    }

    private String getOuterHtml(String content) {
        StringBuilder sb = new StringBuilder();
        append(content);
        return sb.toString();
    }

    @Test
    public void testGetOuterHtml() {
        MockDocument mockDocument = new MockDocument();
        Document document = new Document();
        document.append("Hello World");
        assertEquals("<p>Hello World</p>", document.getOuterHtml());
    }

}