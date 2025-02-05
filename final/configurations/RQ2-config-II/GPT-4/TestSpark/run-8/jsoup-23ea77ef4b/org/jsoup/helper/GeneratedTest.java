package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareWithArgumentTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(false);
        assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document document = new Document("test");
        assertNotNull(W3CDom.convert(document));
    }

    @Test
    public void asStringWithPropertiesTest() {
        org.w3c.dom.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Map<String, String> properties = new HashMap<>();
        properties.put("method", "xml");
        String output = W3CDom.asString(doc, properties);
        assertNotNull(output);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertEquals("value", properties.get("key"));
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        assertNotNull(outputHtml);
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        assertNotNull(outputXml);
    }

    @Test
    public void fromJsoupDocumentTest() {
        Document document = new Document("test");
        W3CDom w3CDom = new W3CDom();
        assertNotNull(w3CDom.fromJsoup(document));
    }

    @Test
    public void fromJsoupElementTest() {
        Element element = new Element(Tag.valueOf("test"), "");
        W3CDom w3CDom = new W3CDom();
        assertNotNull(w3CDom.fromJsoup(element));
    }

    @Test
    public void convertDocumentOutTest() {
        Document document = new Document("test");
        org.w3c.dom.Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        W3CDom w3CDom = new W3CDom();
        w3CDom.convert(document, out);
        assertNotNull(out);
    }

    @Test
    public void selectXpathDocumentTest() {
        org.w3c.dom.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        W3CDom w3CDom = new W3CDom();
        NodeList nodeList = w3CDom.selectXpath("//test", doc);
        assertNotNull(nodeList);
    }

    @Test
    public void selectXpathNodeTest() {
        Node contextNode = new NodeImpl();
        W3CDom w3CDom = new W3CDom();
        NodeList nodeList = w3CDom.selectXpath("//test", contextNode);
        assertNotNull(nodeList);
    }

    @Test
    public void contextNodeTest() {
        org.w3c.dom.Document wDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        W3CDom w3CDom = new W3CDom();
        Node contextNode = w3CDom.contextNode(wDoc);
        assertNotNull(contextNode);
    }

    @Test
    public void asStringTest() {
        org.w3c.dom.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        W3CDom w3CDom = new W3CDom();
        String output = w3CDom.asString(doc);
        assertNotNull(output);
    }

}