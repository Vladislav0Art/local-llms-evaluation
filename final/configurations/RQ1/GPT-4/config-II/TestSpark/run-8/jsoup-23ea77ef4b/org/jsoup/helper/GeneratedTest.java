package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareDefaultTest() {
        W3CDom w3cDom = new W3CDom();
        assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareUpdatedTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(false);
        assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void convertTest() {
        org.jsoup.nodes.Document document = new Document("http://example.com");
        Document converted = W3CDom.convert(document);
        assertNotNull(converted);
    }

    @Test
    public void fromJsoupTest() {
        org.jsoup.nodes.Document document = new Document("http://example.com");
        W3CDom w3cDom = new W3CDom();
        Document converted = w3cDom.fromJsoup(document);
        assertNotNull(converted);
    }

    @Test
    public void convertIntoProvidedTest() {
        org.jsoup.nodes.Document document = new Document("example.com");
        W3CDom w3cDom = new W3CDom();
        Document outputDocument = w3cDom.fromJsoup(new Element("div"));
        w3cDom.convert(document, outputDocument);
        assertEquals("http://example.com", outputDocument.getDocumentURI());
    }

    @Test
    public void contextNodeTest() {
        org.jsoup.nodes.Document input = new Document("http://example.com");
        W3CDom w3cDom = new W3CDom();
        Document output = w3cDom.fromJsoup(input);
        Node contextNode = w3cDom.contextNode(output);
        assertNotNull(contextNode);
    }

    @Test
    public void asStringTest() {
        org.jsoup.nodes.Document document = new Document("http://example.com");
        Document converted = W3CDom.convert(document);
        String output = W3CDom.asString(converted, null);
        assertTrue(output.contains("http://example.com"));
    }

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Properties props = W3CDom.propertiesFromMap(map);
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
    }

    @Test
    public void methodMapTest() {
        HashMap<String, String> map = W3CDom.methodMap("html");
        assertEquals("html", map.get("method"));
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> map = W3CDom.OutputHtml();
        assertEquals("html", map.get("method"));
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> map = W3CDom.OutputXml();
        ;
        assertEquals("xml", map.get("method"));
    }

}