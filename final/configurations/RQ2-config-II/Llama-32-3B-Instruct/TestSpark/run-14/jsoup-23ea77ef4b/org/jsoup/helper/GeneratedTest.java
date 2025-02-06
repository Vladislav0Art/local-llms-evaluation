package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void namespaceAwareFalse() {
        boolean result = new W3CDom().namespaceAware(false);
        assertTrue(result);
    }

    @Test
    public void namespaceAwareTrue() {
        boolean result = new W3CDom().namespaceAware(true);
        assertTrue(result);
    }

    @Test
    public void convertDocument() {
        Document inDoc = Document.html("<html><body>Hello World!</body></html>");
        Document outDoc = Document.convert(inDoc);
        assertNotNull(outDoc);
        assertEquals("", outDoc.html());
    }

    @Test
    public void convertElement() {
        Element inEle = new Element("div", "Hello World!");
        Document outDoc = W3CDom.fromJsoup(inEle);
        assertNotNull(outDoc);
        assertEquals("", outDoc.html());
    }

    @Test
    public void fromJsoupDocument() {
        Document htmlDoc = Document.html("<html><body>Hello World!</body></html>");
        Document jsoupDoc = W3CDom.fromJsoup(htmlDoc);
        assertNotNull(jsoupDoc);
        assertEquals("", jsoupDoc.html());
    }

    @Test
    public void convertDocument2() {
        Document inDoc = Document.html("<html><body>Hello World!</body></html>");
        Document outDoc = new W3CDom().convert(inDoc, Document.html());
        assertNotNull(outDoc);
        assertEquals("", outDoc.html());
    }

    @Test
    public void convertElement2() {
        Element inEle = new Element("div", "Hello World!");
        Document outDoc = new W3CDom().convert(inEle, Document.html());
        assertNotNull(outDoc);
        assertEquals("", outDoc.html());
    }

    @Test
    public void selectXpathDocument() {
        Document htmlDoc = Document.html("<html><body>Hello World!</body></html>");
        NodeList nodes = htmlDoc.selectXpath("//body", htmlDoc);
        assertNotNull(nodes);
        assertEquals(1, nodes.getLength());
    }

    @Test
    public void sourceNodesList() {
        NodeList nodeList = new NodeTraversor().traverse(htmlDoc.selectXpath("//body", htmlDoc));
        List<Node> nodes = W3CDom.sourceNodes(nodeList, Node.class);
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
    }

    @Test
    public void contextNodeDocument() {
        Document wDoc = Document.html("<html><body>Hello World!</body></html>");
        Node contextNode = new W3CDom().contextNode(wDoc);
        assertNotNull(contextNode);
        assertTrue(contextNode instanceof Element);
    }

    @Test
    public void asStringDocument() {
        Document doc = Document.html("<html><body>Hello World!</body></html>");
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
        assertEquals("", result);
    }

}