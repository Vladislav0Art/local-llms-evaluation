package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    public static void main(String[] args) {
        new TextNodeTest().run();
    }

    @Test
    public void testNodeName() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("test");

        TextNode textNode = new TextNode(document, element);
        assertEquals("text", textNode.nodeName());
    }

    @Test
    public void testText() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("test");
        element.append(new TextNode(document, element));

        TextNode textNode = new TextNode(document, element);
        assertEquals("test", textNode.text());
    }

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Element element = document.createElement("text");

        TextNode textNode = new TextNode(document, element);

        Mockito.when(element.outerHtmlHead(Mockito.any(Appendable.class), Mockito.anyInt(Mockito.any < Document.OutputSettings.class))).thenReturn(null);
        assertEquals("", textNode.outerHtmlHead((Appendable) null, 0));
    }

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Element element = document.createElement("text");

        TextNode textNode = new TextNode(document, element);

        Mockito.when(element.outerHtmlTail(Mockito.any(Appendable.class), Mockito.anyInt(Mockito.any < Document.OutputSettings.class))).thenReturn(null);
        assertEquals("", textNode.outerHtmlTail((Appendable) null, 0));
    }

    @Test
    public void testToString() {
        Document document = new Document();
        Element element = document.createElement("text");

        TextNode textNode = new TextNode(document, element);

        assertEquals("", textNode.toString());
    }

    @Test
    public void testClone() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("test");

        TextNode textNode = new TextNode(document, element);

        try {
            TextNode clone = textNode.clone();
        } catch (Exception e) {
            fail("Failed to throw exception when calling clone() method");
        }
    }

    @Test
    public void testCreateFromEncoded() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("test");

        TextNode textNode = new TextNode(document, element);

        try {
            TextNode createdTextNode = TextNode.createFromEncoded("test");
        } catch (Exception e) {
            fail("Failed to throw exception when calling createFromEncoded() method");
        }
    }

    @Test
    public void testNormaliseWhitespace() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("  test");

        TextNode textNode = new TextNode(document, element);
        assertEquals("test", TextNode.normaliseWhitespace(element.getText()));
    }

    @Test
    public void testStripLeadingWhitespace() {
        Document document = new Document();
        Element element = document.createElement("text");
        element.setText("");

        TextNode textNode = new TextNode(document, element);
        assertEquals("", TextNode.stripLeadingWhitespace(element.getText()));
    }

}