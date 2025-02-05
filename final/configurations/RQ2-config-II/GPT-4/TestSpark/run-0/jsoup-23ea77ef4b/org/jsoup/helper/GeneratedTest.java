package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import javax.xml.xpath.XPathExpressionException;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareBooleanTest() {
        W3CDom w3cDom = new W3CDom().namespaceAware(true);
        assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void selectXpathEmptyStringTest() throws XPathExpressionException {
        W3CDom w3cDom = new W3CDom();
        org.jsoup.nodes.Document document = new Document("");
        javax.xml.parsers.Document w3cDocument = W3CDom.convert(document);
        w3cDom.selectXpath("", w3cDocument);
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> properties = W3CDom.OutputHtml();
        assertTrue(properties.containsKey("method"));
        assertTrue(properties.containsKey("indent"));
        assertTrue(properties.containsKey("xml-declaration"));
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> properties = W3CDom.OutputXml();
        assertTrue(properties.containsKey("method"));
        assertFalse(properties.containsKey("indent"));
        assertTrue(properties.containsKey("xml-declaration"));
    }

    @Test
    public void convertDocumentTest() {
        org.jsoup.nodes.Document document = new Document("");
        javax.xml.parsers.Document w3cDocument = W3CDom.convert(document);
        assertNotNull(w3cDocument);
    }

    @Test
    public void convertElementToDocumentTest() {
        Element element = new Element("div");
        W3CDom w3cDom = new W3CDom();
        javax.xml.parsers.Document w3cDocument = w3cDom.fromJsoup(element);
        assertNotNull(w3cDocument);
    }

    @Test
    public void convertDocumentToDocumentTest() {
        org.jsoup.nodes.Document document = new Document("");
        W3CDom w3cDom = new W3CDom();
        javax.xml.parsers.Document w3cDocument = w3cDom.fromJsoup(document);
        assertNotNull(w3cDocument);
    }

    @Test
    public void sourceNodesTest() {
        org.jsoup.nodes.Document document = new Document("");
        TextNode textNode = new TextNode("Test", "");
        document.appendChild(textNode);
        javax.xml.parsers.Document w3cDocument = W3CDom.convert(document);
        W3CDom w3cDom = new W3CDom();
        javax.xml.parsers.NodeList nodeList = w3cDom.selectXpath("//text()", w3cDocument);
        List<TextNode> sourceNodes = w3cDom.sourceNodes(nodeList, TextNode.class);
        assertFalse(sourceNodes.isEmpty());
    }

}