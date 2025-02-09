package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void namespaceAware() {
        assertTrue(W3CDom.namespaceAware());
    }

    @Test
    public void namespaceAware_set_to_false() {
        W3CDom w3cDom = new W3CDom();
        assertFalse(w3cDom.namespaceAware(true));
    }

    @Test
    public void convert_EmptyDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Document convertedDoc = W3CDom.convert(document);
        assertNotNull(convertedDoc);
    }

    @Test
    public void asString_NoProperties() {
        Map<String, String> properties = new HashMap<>();
        String result = W3CDom.asString(null, properties);
        assertTrue(result.contains("Unknown"));
    }

    @Test
    public void OutputHtml() {
        Properties properties = W3CDom.propertiesFromMap(Map.of("foo", "bar"));
        Map<String, String> outputHtml = W3CDom.OutputHtml();
        assertEquals(properties, outputHtml);
    }

    @Test
    public void OutputXml() {
        Properties properties = W3CDom.propertiesFromMap(Map.of("foo", "bar"));
        Map<String, String> outputXml = W3CDom.OutputXml();
        assertTrue(outputXml.containsKey("xmlns"));
        assertEquals(properties, outputXml);
    }

    @Test
    public void fromJsoup_EmptyDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Document convertedDoc = W3CDom.fromJsoup(document);
        assertNotNull(convertedDoc);
    }

    @Test
    public void fromJsoup_SingleChildElement() {
        Element element = Element.of("html");
        Document convertedDoc = W3CDom.fromJsoup(element);
        assertNotNull(convertedDoc);
    }

    @Test
    public void convert_SingleChildDocument() {
        org.jsoup.nodes.Document document = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Element child = document.createElement("child");
        document.appendChild(child);
        Document convertedDoc = W3CDom.convert(document);
        assertNotNull(convertedDoc);
    }

    @Test
    public void convert_SingleChildElement() {
        Element element = Element.of("html", "body", "child");
        Document convertedDoc = W3CDom.fromJsoup(element);
        assertNotNull(convertedDoc);
    }

    @Test
    public void selectXpath_EmptyXPathDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        NodeList nodeList = document.getElementsByTagName("child");
        NodeList selectedNodes = W3CDom.selectXpath("", document);
        assertEquals(0, selectedNodes.getLength());
    }

    @Test
    public void selectXpath_EmptyXPathElement() {
        Element element = Element.of("html", "body", "child");
        NodeList nodeList = element.getElementsByTagName("child");
        NodeList selectedNodes = W3CDom.selectXpath("", element);
        assertEquals(0, selectedNodes.getLength());
    }

    @Test
    public void sourceNodes_SingleChildNode() {
        NodeList nodeList = new org.jsoup.nodes.Document().getElementsByTagName("child").toArray(new org.jsoup.nodes.Node[0]);
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertEquals(1, result.size());
    }

    @Test
    public void sourceNodes_SingleChildNode() {
        NodeList nodeList = new org.jsoup.nodes.Document().getElementsByTagName("child").toArray(new org.jsoup.nodes.Node[0]);
        List<Node> result = W3CDom.sourceNodes(nodeList, Node.class);
        assertEquals(1, result.size());
    }

    @Test
    public void contextNode_EmptyDocument() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Node contextNode = W3CDom.contextNode(document);
        assertNotNull(contextNode);
    }

    @Test
    public void asString_SingleChildElement() {
        org.jsoup.nodes.Document document = new org.jsoup.nodes.Document();
        Element child = document.createElement("child");
        document.appendChild(child);
        String result = W3CDom.asString(document);
        assertEquals("child", result);
    }

    @Test
    public void asString_SingleChildElement() {
        org.jsoup.nodes.Document document = new org.jsoup.nodes.Document();
        Element child = document.createElement("child");
        document.appendChild(child);
        String result = W3CDom.asString(document);
        assertEquals("child", result);
    }

}