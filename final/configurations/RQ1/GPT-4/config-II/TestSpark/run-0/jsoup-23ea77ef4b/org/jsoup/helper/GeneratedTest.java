package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareWithFalseTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(false);
        assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void convertTest() {
        Document document = new Document("http://example.com");
        document.appendElement("div").text("Hello, World!");
        org.w3c.dom.Document convertedDocument = W3CDom.convert(document);
        assertEquals("http://example.com", convertedDocument.getDocumentURI());
    }

    @Test
    public void asStringTest() {
        Document document = new Document("http://example.com");
        document.appendElement("div").text("Hello, World!");
        org.w3c.dom.Document convertedDocument = W3CDom.convert(document);
        String convertedString = W3CDom.asString(convertedDocument, null);
        assertTrue(convertedString.contains(convertedDocument.getDocumentURI()));
    }

    @Test
    public void fromJsoupTest() {
        Document baseDocument = new Document("http://example.com");
        baseDocument.appendElement("div").text("Hello, World!");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document fromJsoupDocument = w3cDom.fromJsoup(baseDocument);
        assertEquals(baseDocument.location(), fromJsoupDocument.getDocumentURI());
    }

    @Test
    public void selectXpathTest() {
        Document document = new Document("http://example.com");
        document.appendElement("div").text("Hello, World!");
        org.w3c.dom.Document w3cDocument = W3CDom.convert(document);
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = w3cDom.selectXpath("//div", w3cDocument);
        assertEquals("Hello, World!", nodeList.item(0).getTextContent());
    }

    @Test
    public void contextNodeTest() {
        Document document = new Document("http://example.com");
        document.appendElement("div").text("Hello, World!");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document w3cDocument = w3cDom.fromJsoup(document);
        assertNotNull(w3cDom.contextNode(w3cDocument));
    }

    @Test
    public void asStringWithPropertiesTest() {
        Document document = new Document("http://example.com");
        document.appendElement("div").text("Hello, World!");
        org.w3c.dom.Document w3cDocument = W3CDom.convert(document);
        String documentAsString = W3CDom.asString(w3cDocument, W3CDom.OutputHtml());
        assertTrue(documentAsString.contains(w3cDocument.getDocumentURI()));
    }

}