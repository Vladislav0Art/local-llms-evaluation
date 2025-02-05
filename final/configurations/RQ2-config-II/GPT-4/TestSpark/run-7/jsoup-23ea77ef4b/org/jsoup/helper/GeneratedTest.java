package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        new W3CDom();
    }

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assertFalse(w3CDom.namespaceAware());
        w3CDom.namespaceAware(true);
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void convertInputDocumentTest() {
        Document document = new Document(OutputKeys.METHOD);
        assertNotNull(W3CDom.convert(document));
    }

    @Test
    public void asStringWithPropertiesTest() {
        org.w3c.dom.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Map<String, String> properties = new HashMap<>();
        properties.put(OutputKeys.INDENT, "yes");
        assertNotNull(W3CDom.asString(document, properties));
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("test", "value");
        assertEquals("value", W3CDom.propertiesFromMap(map).getProperty("test"));
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> properties = W3CDom.OutputHtml();
        assertNotNull(properties);
        assertTrue(properties.containsKey(METHOD));
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> properties = W3CDom.OutputXml();
        assertNotNull(properties);
        assertTrue(properties.containsKey(METHOD));
    }

    @Test
    public void fromJsoupWithDocumentInputTest() {
        Document document = new Document(OutputKeys.METHOD);
        W3CDom w3CDom = new W3CDom();
        assertNotNull(w3CDom.fromJsoup(document));
    }

    @Test
    public void fromJsoupWithElementInputTest() {
        Element element = new Element(Tag.valueOf("p"), "");
        W3CDom w3CDom = new W3CDom();
        assertNotNull(w3CDom.fromJsoup(element));
    }

    @Test
    public void convertWithDocInputTest() {
        Document document = new Document(OutputKeys.METHOD);
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        // This method does not return a value, we test it for exceptions thrown
        w3CDom.convert(document, out);
    }

    @Test
    public void convertWithElementInputTest() {
        Element element = new Element(Tag.valueOf("p"), "");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document out = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        // This method does not return a value, we test it for exceptions thrown
        w3CDom.convert(element, out);
    }

    @Test
    public void selectXpathWithDocTest() {
        String xpath = "/document";
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodeList = w3CDom.selectXpath(xpath, doc);
        assertNotNull(nodeList);
    }

    @Test
    public void selectXpathWithContextNodeTest() {
        String xpath = "/document";
        W3CDom w3CDom = new W3CDom();
        Node contextNode = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodeList = w3CDom.selectXpath(xpath, contextNode);
        assertNotNull(nodeList);
    }

    @Test
    public void sourceNodesTest() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        W3CDom w3CDom = new W3CDom();
        List<org.jsoup.nodes.Node> nodes = w3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(nodes);
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
        org.w3c.dom.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        assertNotNull(W3CDom.asString(document));
    }

}