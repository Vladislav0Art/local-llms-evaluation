package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        Assert.assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareWithParameterTest() {
        W3CDom w3cDom = new W3CDom().namespaceAware(true);
        Assert.assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document document = Mockito.mock(Document.class);
        org.w3c.dom.Document result = W3CDom.convert(document);
        Assert.assertNotNull(result);
    }

    @Test
    public void asStringWithPropertiesTest() {
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        Map<String, String> properties = new HashMap<>();
        String result = W3CDom.asString(document, properties);
        Assert.assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Properties properties = W3CDom.propertiesFromMap(map);
        Assert.assertNotNull(properties);
        Assert.assertEquals("value", properties.getProperty("key"));
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        Assert.assertNotNull(result);
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        Assert.assertNotNull(result);
    }

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document document = Mockito.mock(Document.class);
        org.w3c.dom.Document result = w3cDom.fromJsoup(document);
        Assert.assertNotNull(result);
    }

    @Test
    public void fromJsoupElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = Mockito.mock(Element.class);
        org.w3c.dom.Document result = w3cDom.fromJsoup(element);
        Assert.assertNotNull(result);
    }

    @Test
    public void convertElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = Mockito.mock(Element.class);
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        w3cDom.convert(element, document);
        // The method does not return a value
    }

    @Test
    public void selectXpathWithDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        NodeList nodeList = w3cDom.selectXpath("/", document);
        Assert.assertNotNull(nodeList);
    }

    @Test
    public void selectXpathWithContextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        Node node = Mockito.mock(Node.class);
        NodeList nodeList = w3cDom.selectXpath("/", node);
        Assert.assertNotNull(nodeList);
    }

    @Test
    public void sourceNodesTest() {
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = Mockito.mock(NodeList.class);
        List<Element> result = w3cDom.sourceNodes(nodeList, Element.class);
        Assert.assertNotNull(result);
    }

    @Test
    public void contextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        Node node = w3cDom.contextNode(document);
        Assert.assertNotNull(node);
    }

    @Test
    public void asStringTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        String result = w3cDom.asString(document);
        Assert.assertNotNull(result);
    }

}