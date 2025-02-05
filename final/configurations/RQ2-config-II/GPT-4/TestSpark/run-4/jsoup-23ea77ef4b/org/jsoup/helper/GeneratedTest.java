package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        boolean result = w3CDom.namespaceAware();
        Assert.assertTrue(result);
    }

    @Test
    public void namespaceAwareBooleanTest() {
        W3CDom w3CDom = new W3CDom();
        W3CDom result = w3CDom.namespaceAware(false);
        Assert.assertNotNull(result);
    }

    @Test
    public void convertDocumentTest() {
        org.jsoup.nodes.Document in = Mockito.mock(org.jsoup.nodes.Document.class);
        Document doc = W3CDom.convert(in);
        Assert.assertNotNull(doc);
    }

    @Test
    public void asStringWithPropertiesTest() {
        Document doc = Mockito.mock(Document.class);
        Map<String, String> properties = new HashMap<>();
        String result = W3CDom.asString(doc, properties);
        Assert.assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("Test", "TestValue");
        Properties result = W3CDom.propertiesFromMap(map);
        Assert.assertEquals(1, result.size());
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
        W3CDom w3CDom = new W3CDom();
        org.jsoup.nodes.Document in = Mockito.mock(org.jsoup.nodes.Document.class);
        Document doc = w3CDom.fromJsoup(in);
        Assert.assertNotNull(doc);
    }

    @Test
    public void fromJsoupElementTest() {
        W3CDom w3CDom = new W3CDom();
        Element in = Mockito.mock(Element.class);
        Document doc = w3CDom.fromJsoup(in);
        Assert.assertNotNull(doc);
    }

    @Test
    public void convertToOutDocumentTest() {
        W3CDom w3CDom = new W3CDom();
        org.jsoup.nodes.Document in = Mockito.mock(org.jsoup.nodes.Document.class);
        Document out = Mockito.mock(Document.class);
        w3CDom.convert(in, out);
        Assert.assertNotNull(out);
    }

    @Test
    public void convertToOutElementTest() {
        W3CDom w3CDom = new W3CDom();
        Element in = Mockito.mock(Element.class);
        Document out = Mockito.mock(Document.class);
        w3CDom.convert(in, out);
        Assert.assertNotNull(out);
    }

    @Test
    public void selectXpathDocumentTest() {
        W3CDom w3CDom = new W3CDom();
        Document doc = Mockito.mock(Document.class);
        NodeList nodeList = w3CDom.selectXpath("//a", doc);
        Assert.assertNotNull(nodeList);
    }

    @Test
    public void selectXpathNodeTest() {
        W3CDom w3CDom = new W3CDom();
        Node node = Mockito.mock(Node.class);
        NodeList nodeList = w3CDom.selectXpath("//a", node);
        Assert.assertNotNull(nodeList);
    }

    @Test
    public void sourceNodesTest() {
        W3CDom w3CDom = new W3CDom();
        NodeList nodeList = Mockito.mock(NodeList.class);
        List<Element> result = w3CDom.sourceNodes(nodeList, Element.class);
        Assert.assertNotNull(result);
    }

    @Test
    public void contextNodeTest() {
        W3CDom w3CDom = new W3CDom();
        Document doc = Mockito.mock(Document.class);
        Node node = w3CDom.contextNode(doc);
        Assert.assertNotNull(node);
    }

    @Test
    public void asStringTest() {
        W3CDom w3CDom = new W3CDom();
        Document doc = Mockito.mock(Document.class);
        String result = w3CDom.asString(doc);
        Assert.assertNotNull(result);
    }

}