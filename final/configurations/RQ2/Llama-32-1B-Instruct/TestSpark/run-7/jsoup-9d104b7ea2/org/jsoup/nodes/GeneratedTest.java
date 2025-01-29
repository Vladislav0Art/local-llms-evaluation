package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

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
        Document document = new Document();
        document.append("Hello World");
        assertEquals("<p>Hello World</p>", document.getOuterHtml());
    }
}
		
		import org.junit.Test;
		import static org.junit.Assert.assertEquals;

public class MockDocument extends java.util.ArrayList<TextView> implements Document {

    public String outerHtmlHead(MockDocument document, int start, int end) {
        return "";
    }

    public String outerHtmlTail(MockDocument document, int start, int end) {
        return "";
    }
}

@Test
public void testGetOuterHtml() {
    MockDocument mockDocument = new MockDocument();
    Document document = new Document();
    document.append("Hello World");
    assertEquals("<p>Hello World</p>", document.getOuterHtml());
}

@Test
public void testAppendTextAndGetOuterHtml() {
    MockDocument mockDocument = new MockDocument();
    Document document = new Document();
    document.append("Hello World");
    String content = document.getOuterHtml();
    assertEquals("<p>Hello World</p>", content);
    assertEquals("Hello World", document.appendText("Hello World").toString());
}

@Test
public void testGetOuterHtmlWithMultipleParagraphs() {
    MockDocument mockDocument = new MockDocument();
    Document document = new Document();
    for (int i = 0; i < 10; i++) {
        String content = "This is a paragraph " + i;
        document.append(content);
        assertEquals("<p>This is a paragraph " + i + "</p>", document.getOuterHtml());
    }
}

@Test
public void testGetOuterHtmlWithHeadingAndParagraph() {
    MockDocument mockDocument = new MockDocument();
    Document document = new Document();
    Element h1 = document.appendElement("h1").text("Heading");
    String content = "This is a paragraph and <p>This is another paragraph</p>";
    document.append(content);
    assertEquals("<h1>Heading</h1><p>This is a paragraph " + 10 + "<p>This is another paragraph</p></p>", document.getOuterHtml());
}

}