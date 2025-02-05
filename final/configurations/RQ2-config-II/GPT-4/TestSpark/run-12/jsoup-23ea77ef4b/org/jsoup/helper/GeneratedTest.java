package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedTest {

    W3CDom w3cDom = new W3CDom();

    @Test
    public void namespaceAwareTest() {
        boolean returnValue = w3cDom.namespaceAware();
        assertFalse(returnValue);

        W3CDom returnedDom = w3cDom.namespaceAware(true);
        assertNotNull(returnedDom);
        assertTrue(returnedDom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document jsoupDoc = new Document("http://test.com");
        org.w3c.dom.Document xmlDom = W3CDom.convert(jsoupDoc);

        assertNotNull(xmlDom);
        assertEquals("http://test.com", xmlDom.getDocumentURI());
    }

    @Test
    public void asStringWithPropertiesTest() {
        org.w3c.dom.Document xmlDom = generateMockDocument();

        Map<String, String> properties = new HashMap<>();
        properties.put(OutputKeys.INDENT, "yes");
        String xmlDocString = W3CDom.asString(xmlDom, properties);

        assertNotNull(xmlDocString);
        assertTrue(xmlDocString.contains("<test>Hello world!</test>"));
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Properties properties = W3CDom.propertiesFromMap(map);

        assertEquals("value1", properties.getProperty("key1"));
        assertEquals("value2", properties.getProperty("key2"));
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> properties = W3CDom.OutputHtml();
        assertEquals("html", properties.get(METHOD));
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> properties = W3CDom.OutputXml();
        assertEquals("xml", properties.get(METHOD));
    }

    @Test
    public void fromJsoupAsDocumentTest() {
        Document jsoupDoc = new Document("http://test.com");
        org.w3c.dom.Document xmlDom = w3cDom.fromJsoup(jsoupDoc);

        assertEquals("http://test.com", xmlDom.getDocumentURI());
    }

    @Test
    public void fromJsoupAsElementTest() {
        Element jsoupElement = new Element("test");
        jsoupElement.text("Hello world!");
        org.w3c.dom.Document xmlDom = w3cDom.fromJsoup(jsoupElement);

        assertEquals("test", xmlDom.getDocumentElement().getNodeName());
        assertEquals("Hello world!", xmlDom.getDocumentElement().getTextContent());
    }

    @Test
    public void selectXpathDocumentTest() {
        org.w3c.dom.Document xmlDom = generateMockDocument();
        NodeList res = w3cDom.selectXpath("/test", xmlDom);

        assertEquals(1, res.getLength());
    }

    @Test
    public void selectXpathNodeTest() {
        org.w3c.dom.Document xmlDom = generateMockDocument();
        Node rootNode = xmlDom.getDocumentElement();
        NodeList res = w3cDom.selectXpath("/test", rootNode);

        assertEquals(1, res.getLength());
    }

    @Test
    public void sourceNodesTest() {
        org.w3c.dom.Document xmlDom = generateMockDocument();
        NodeList nodeList = xmlDom.getChildNodes();
        List<Document> res = w3cDom.sourceNodes(nodeList, Document.class);

        assertEquals(1, res.size());
        assertTrue(res.get(0) instanceof Document);
    }

    @Test
    public void contextNodeTest() {
        org.w3c.dom.Document xmlDom = generateMockDocument();
        Node resNode = w3cDom.contextNode(xmlDom);

        assertNotNull(resNode);
    }

    @Test
    public void asStringTest() {
        org.w3c.dom.Document xmlDom = generateMockDocument();
        String xmlDocString = w3cDom.asString(xmlDom);

        assertNotNull(xmlDocString);
        assertTrue(xmlDocString.contains("<test>Hello world!</test>"));
    }

    // Generating a mock w3c dom document for testing
    private org.w3c.dom.Document generateMockDocument() {
        org.w3c.dom.Document xmlDom = null;
        try {
            xmlDom = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            org.w3c.dom.Element rootElement = xmlDom.createElement("test");
            rootElement.setTextContent("Hello world!");
            xmlDom.appendChild(rootElement);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return xmlDom;
    }

}