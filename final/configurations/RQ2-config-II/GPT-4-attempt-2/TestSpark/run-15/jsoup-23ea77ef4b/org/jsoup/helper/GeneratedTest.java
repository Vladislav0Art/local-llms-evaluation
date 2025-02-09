package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void ConstructorDefaultTest() {
        W3CDom testObj = new W3CDom();
        assertNotNull(testObj);
    }

    @Test
    public void namespaceAwareDefaultTest() {
        W3CDom testObj = new W3CDom();
        assertFalse(testObj.namespaceAware());
    }

    @Test
    public void namespaceAwareTrueTest() {
        W3CDom testObj = new W3CDom();
        testObj.namespaceAware(true);
        assertTrue(testObj.namespaceAware());
    }

    @Test
    public void convertJsoupDocumentTest() {
        Document jsoupDocument = new Document("");
        assertNotNull(W3CDom.convert(jsoupDocument));
    }

    @Test
    public void asStringWithPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        Document doc = W3CDom.convert(new Document(""));
        assertNotNull(W3CDom.asString(doc, properties));
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        assertNotNull(W3CDom.propertiesFromMap(map));
    }

    @Test
    public void OutputHtmlTest() {
        assertNotNull(W3CDom.OutputHtml());
    }

    @Test
    public void OutputXmlTest() {
        assertNotNull(W3CDom.OutputXml());
    }

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom testObj = new W3CDom();
        Document jsoupDocument = new Document("");
        assertNotNull(testObj.fromJsoup(jsoupDocument));
    }

    @Test
    public void fromJsoupElementTest() {
        W3CDom testObj = new W3CDom();
        Element jsoupElement = new Element("");
        assertNotNull(testObj.fromJsoup(jsoupElement));
    }

    @Test
    public void convertDocumentTest() {
        W3CDom testObj = new W3CDom();
        Document jsoupDocument = new Document("");
        Document doc = testObj.fromJsoup(jsoupDocument);
        testObj.convert(jsoupDocument, doc);
        // check conversion success
        assertEquals(doc.getChildNodes().getLength(), 0);
    }

    @Test
    public void selectXpathInDocumentTest() {
        W3CDom testObj = new W3CDom();
        Document jsoupDocument = new Document("");
        Document doc = testObj.fromJsoup(jsoupDocument);
        NodeList nodeList = testObj.selectXpath("/html/body/div", doc);
        assertNotNull(nodeList);
    }

    @Test
    public void selectXpathInNodeTest() {
        W3CDom testObj = new W3CDom();
        Document jsoupDocument = new Document("");
        Document doc = testObj.fromJsoup(jsoupDocument);
        Node node = doc.createElement("div");
        NodeList nodeList = testObj.selectXpath("/div/p", node);
        assertNotNull(nodeList);
    }

    @Test
    public void sourceNodesTest() {
        W3CDom testObj = new W3CDom();
        Document jsoupDocument = new Document("");
        Document doc = testObj.fromJsoup(jsoupDocument);
        NodeList nodeList = doc.getChildNodes();
        assertNotNull(testObj.sourceNodes(nodeList, Element.class));
    }

    @Test
    public void contextNodeTest() {
        W3CDom testObj = new W3CDom();
        Document jsoupDocument = new Document("");
        org.w3c.dom.Document doc = testObj.fromJsoup(jsoupDocument);
        assertNotNull(testObj.contextNode(doc));
    }

    @Test
    public void asStringOnlyDocNullPropertiesTest() {
        W3CDom testObj = new W3CDom();
        javax.xml.parsers.DocumentBuilderFactory factory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        javax.xml.parsers.DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document doc = builder.newDocument();
        assertNotNull(testObj.asString(doc));
    }

}