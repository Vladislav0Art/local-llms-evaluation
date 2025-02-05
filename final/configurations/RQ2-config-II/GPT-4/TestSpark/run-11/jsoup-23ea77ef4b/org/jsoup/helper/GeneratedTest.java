package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertFalse(w3cDom.namespaceAware());
        w3cDom.namespaceAware(true);
        assertTrue(w3cDom.namespaceAware());
        w3cDom.namespaceAware(false);
        assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        org.jsoup.nodes.Document document = new Document("http://test.org");
        Document result = W3CDom.convert(document);
        assertNotNull(result);
    }

    @Test
    public void convertElementToDocumentTest() {
        org.jsoup.nodes.Element element = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://test.org");
        Document result = new W3CDom().fromJsoup(element);
        assertNotNull(result);
    }

    @Test
    public void asStringWithPropertiesTest() {
        Document document = W3CDom.convert(new Document("http://test.org"));
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        String result = W3CDom.asString(document, properties);
        assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        assertEquals(map, W3CDom.propertiesFromMap(map));
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
    }

    @Test
    public void convertInOutDocumentTest() {
        Document out = W3CDom.convert(new Document("http://test.org"));
        Document in = W3CDom.convert(new Document("http://test2.org"));
        new W3CDom().convert(in, out);
        assertEquals(out, in);
    }

    @Test
    public void convertInOutElementTest() {
        org.jsoup.nodes.Element element = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://test.org");
        Document out = new W3CDom().fromJsoup(element);
        new W3CDom().convert(element, out);
        assertEquals(out, out);
    }

    @Test
    public void selectXpathDocumentTest() {
        Document document = W3CDom.convert(new Document("http://test.org"));
        NodeList result = new W3CDom().selectXpath("//test", document);
        assertNotNull(result);
    }

    @Test
    public void selectXpathContextNodeTest() {
        Node contextNode = W3CDom.convert(new Document("http://test.org")).getFirstChild();
        NodeList result = new W3CDom().selectXpath("//test", contextNode);
        assertNotNull(result);
    }

    @Test
    public void sourceNodesTest() {
        NodeList nodeList = W3CDom.convert(new Document("http://test.org")).getChildNodes();
        List<Element> result = new W3CDom().sourceNodes(nodeList, Element.class);
        assertNotNull(result);
    }

    @Test
    public void contextNodeTest() {
        Document document = W3CDom.convert(new Document("http://test.org"));
        Node result = new W3CDom().contextNode(document);
        assertNotNull(result);
    }

    @Test
    public void asStringTest() {
        Document document = W3CDom.convert(new Document("http://test.org"));
        String result = new W3CDom().asString(document);
        assertNotNull(result);
    }

}