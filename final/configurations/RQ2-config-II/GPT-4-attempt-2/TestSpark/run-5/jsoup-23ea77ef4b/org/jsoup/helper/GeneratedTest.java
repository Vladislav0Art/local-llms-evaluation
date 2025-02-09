package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom dom = new W3CDom();
        assertFalse(dom.namespaceAware());
    }

    @Test
    public void namespaceAwareSetTrueTest() {
        W3CDom dom = new W3CDom().namespaceAware(true);
        assertTrue(dom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() throws Exception {
        Document document = Mockito.mock(Document.class);
        org.w3c.dom.Document converted = W3CDom.convert(document);
        assertNotNull(converted);
    }

    @Test
    public void asStringWithPropertiesTest() throws Exception {
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");

        String result = W3CDom.asString(doc, properties);
        assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");

        Properties properties = W3CDom.propertiesFromMap(map);
        assertEquals(1, properties.size());
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> properties = W3CDom.OutputHtml();
        assertNotNull(properties);
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> properties = W3CDom.OutputXml();
        assertNotNull(properties);
    }

    @Test
    public void fromJsoupDocumentTest() {
        Document jsoupDoc = Mockito.mock(Document.class);
        W3CDom dom = new W3CDom();
        assertNotNull(dom.fromJsoup(jsoupDoc));
    }

    @Test
    public void fromJsoupElementTest() {
        Element element = Mockito.mock(Element.class);
        W3CDom dom = new W3CDom();
        assertNotNull(dom.fromJsoup(element));
    }

    @Test
    public void convertInAndOutDocumentTest() {
        Document in = Mockito.mock(Document.class);
        org.w3c.dom.Document out = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom dom = new W3CDom();
        dom.convert(in, out);
    }

    @Test
    public void convertInAndOutElementTest() {
        Element in = Mockito.mock(Element.class);
        org.w3c.dom.Document out = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom dom = new W3CDom();
        dom.convert(in, out);
    }

    @Test
    public void selectXpathDocumentTest() {
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);

        NodeList nodeList = dom.selectXpath("//someXPath", doc);
        assertNotNull(nodeList);
    }

    @Test
    public void selectXpathNodeTest() {
        W3CDom dom = new W3CDom();
        Node node = Mockito.mock(Node.class);

        NodeList nodeList = dom.selectXpath("//someXPath", node);
        assertNotNull(nodeList);
    }

    @Test
    public void sourceNodesTest() {
        W3CDom dom = new W3CDom();
        NodeList nodeList = Mockito.mock(NodeList.class);
        when(nodeList.getLength()).thenReturn(5);

        List<org.jsoup.nodes.Node> resultNodes = dom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertEquals(5, resultNodes.size());
    }

    @Test
    public void contextNodeTest() {
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        Node result = dom.contextNode(doc);
        assertNotNull(result);
    }

    @Test
    public void asStringTest() {
        W3CDom dom = new W3CDom();
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        String result = dom.asString(doc);
        assertNotNull(result);
    }

}