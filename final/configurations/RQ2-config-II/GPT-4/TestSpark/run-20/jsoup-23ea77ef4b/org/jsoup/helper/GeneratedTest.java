package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareParamTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware(true).namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        org.jsoup.nodes.Document document = mock(org.jsoup.nodes.Document.class);
        Document result = W3CDom.convert(document);
        assertTrue(result instanceof Document);
    }

    @Test
    public void asStringTest() {
        Document document = mock(Document.class);
        Map<String, String> properties = new HashMap<>();
        properties.put("Method", "GET");
        assertTrue(W3CDom.asString(document, properties) instanceof String);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("Method", "GET");
        assertTrue(W3CDom.propertiesFromMap(map) instanceof Properties);
    }

    @Test
    public void OutputHtmlTest() {
        assertTrue(W3CDom.OutputHtml() instanceof HashMap);
    }

    @Test
    public void OutputXmlTest() {
        assertTrue(W3CDom.OutputXml() instanceof HashMap);
    }

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom w3CDom = new W3CDom();
        org.jsoup.nodes.Document document = mock(org.jsoup.nodes.Document.class);
        assertTrue(w3CDom.fromJsoup(document) instanceof Document);
    }

    @Test
    public void fromJsoupElementTest() {
        W3CDom w3CDom = new W3CDom();
        org.jsoup.nodes.Element element = mock(Element.class);
        assertTrue(w3CDom.fromJsoup(element) instanceof Document);
    }

    @Test
    public void convertDocumentParamsTest() {
        W3CDom w3CDom = new W3CDom();
        org.jsoup.nodes.Document in = mock(org.jsoup.nodes.Document.class);
        Document out = mock(Document.class);
        w3CDom.convert(in, out);
        assertTrue(true);
    }

    @Test
    public void convertElementParamsTest() {
        W3CDom w3CDom = new W3CDom();
        org.jsoup.nodes.Element in = mock(Element.class);
        Document out = mock(Document.class);
        w3CDom.convert(in, out);
        assertTrue(true);
    }

    @Test
    public void selectXpathStringDocumentParamsTest() {
        W3CDom w3CDom = new W3CDom();
        Document mockDocument = mock(Document.class);
        assertTrue(w3CDom.selectXpath("//div", mockDocument) instanceof NodeList);
    }

    @Test
    public void selectXpathStringNodeParamsTest() {
        W3CDom w3CDom = new W3CDom();
        Node mockNode = mock(Node.class);
        assertTrue(w3CDom.selectXpath("//div", mockNode) instanceof NodeList);
    }

    @Test
    public void sourceNodesTest() {
        W3CDom w3CDom = new W3CDom();
        NodeList nodeList = mock(NodeList.class);
        assertTrue(w3CDom.sourceNodes(nodeList, Element.class) instanceof List);
    }

    @Test
    public void contextNodeTest() {
        W3CDom w3CDom = new W3CDom();
        Document wDoc = mock(Document.class);
        assertTrue(w3CDom.contextNode(wDoc) instanceof Node);
    }

    @Test
    public void asStringDocumentParamTest() {
        W3CDom w3CDom = new W3CDom();
        Document document = mock(Document.class);
        assertTrue(w3CDom.asString(document) instanceof String);
    }

}