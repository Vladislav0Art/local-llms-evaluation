package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void emptyDocumentNamespaceAwareReturnsFalse() {
        assertFalse(W3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareMethodSetsCorrectProperty() {
        W3CDom w3cdom = new W3CDom();
        boolean result = w3cdom.namespaceAware(true);
        assertEquals(true, w3cdom.namespaceAware());
    }

    @Test
    public void convertFromJsoupReturnsDocument() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Document outDoc = W3CDom.convert(doc);
        assertTrue(outDoc instanceof Document);
    }

    @Test
    public void asStringWithPropertiesSetsCorrectOutput() {
        Map<String, String> properties = new HashMap<>();
        properties.put("method", "html");
        String result = W3CDom.asString(W3CDom.OutputHtml(), properties);
        assertEquals("html", result);
    }

    @Test
    public void OutputHtmlReturnsPropertiesMap() {
        Properties result = W3CDom.OutputHtml();
        assertNotNull(result);
        assertTrue(result.containsKey("method"));
    }

    @Test
    public void OutputXmlReturnsPropertiesMap() {
        Properties result = W3CDom.OutputXml();
        assertNotNull(result);
        assertTrue(result.containsKey("method"));
    }

    @Test
    public void fromJsoupElementReturnsDocument() {
        org.jsoup.nodes.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("div", null, doc);
        Document outDoc = W3CDom.fromJsoup(element);
        assertTrue(outDoc instanceof Document);
    }

    @Test
    public void fromJsoupEmptyElementReturnsDocument() {
        org.jsoup.nodes.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("", null, doc);
        Document outDoc = W3CDom.fromJsoup(element);
        assertTrue(outDoc instanceof Document);
    }

    @Test
    public void convertElementFromJsoupReturnsDocument() {
        org.jsoup.nodes.Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("div", null, doc);
        Document outDoc = W3CDom.convert(element);
        assertTrue(outDoc instanceof Document);
    }

    @Test
    public void contextNodeReturnsCorrectElement() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        Element element = (Element) doc.getDocumentElement();
        Node result = W3CDom.contextNode(doc);
        assertEquals(element, result);
    }

    @Test
    public void selectXpathReturnsEmptyList() {
        NodeList nodeList = new ArrayList<>();
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertTrue(result.isEmpty());
    }

    @Test
    public void sourceNodesWithNodeListReturnsCorrectResult() {
        NodeList nodeList = new ArrayList<>();
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        nodeList.add(doc.getDocumentElement());
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertEquals(1, result.size());
    }

    @Test
    public void selectXpathWithEmptyStringReturnsEmptyList() {
        NodeList nodeList = new ArrayList<>();
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        nodeList.add(doc.getDocumentElement());
        List<Node> result = W3CDom.selectXpath("", doc);
        assertTrue(result.isEmpty());
    }

    @Test
    public void sourceNodesWithEmptyNodeListReturnsCorrectResult() {
        NodeList nodeList = new ArrayList<>();
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("test.xml");
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertTrue(result.isEmpty());
    }

    @Test
    public void asStringWithEmptyMapReturnsCorrectResult() {
        String result = W3CDom.asString(new Document(), new HashMap<>());
        assertNotNull(result);
    }

}