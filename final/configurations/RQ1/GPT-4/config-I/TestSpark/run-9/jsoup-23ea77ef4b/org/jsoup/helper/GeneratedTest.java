package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareFalseTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(false);
        assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void convertTest() {
        org.jsoup.nodes.Element elementMock = mock(org.jsoup.nodes.Element.class);
        Document docMock = mock(Document.class);
        W3CDom w3CDom = new W3CDom();
        w3CDom.convert(elementMock, docMock);
        verify(elementMock, atLeastOnce()).ownerDocument();
    }

    @Test
    public void selectXpathNullNodeTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.selectXpath("test", (Node) null);
    }

    @Test
    public void selectXpathNullStringTest() {
        Node nodeMock = mock(Node.class);
        W3CDom w3CDom = new W3CDom();
        w3CDom.selectXpath(null, nodeMock);
    }

    @Test
    public void fromJsoupTest() throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();

        Attributes attributes = new Attributes();
        attributes.put("class", "test");
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("div");
        W3CDom w3CDom = new W3CDom();
        Document output = w3CDom.fromJsoup(element);
        assertNotNull(output);
    }

    @Test
    public void sourceNodesTest() {
        NodeList nodeListMock = mock(NodeList.class);
        when(nodeListMock.getLength()).thenReturn(1);
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.sourceNodes(nodeListMock, org.jsoup.nodes.Element.class).isEmpty());
    }

    @Test
    public void asStringTest() {
        Document documentMock = mock(Document.class);
        W3CDom w3CDom = new W3CDom();
        assertNotNull(w3CDom.asString(documentMock));
    }

    @Test
    public void asStringWithMapPropertiesTest() {
        Document documentMock = mock(Document.class);
        Map<String, String> props = new HashMap<>();
        props.put("doctype-public", "<!DOCTYPE html>");
        W3CDom w3CDom = spy(W3CDom.class);
        assertNotNull(w3CDom.asString(documentMock, props));
    }

    @Test
    public void contextNodeTest() {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("div");
            W3CDom w3CDom = spy(W3CDom.class);
            w3CDom.fromJsoup(element);
            assertNotNull(w3CDom.contextNode(doc));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void outputHtmlTest() {
        Map<String, String> outputHtml = W3CDom.OutputHtml();
        assertEquals(1, outputHtml.size());
        assertTrue(outputHtml.containsKey("method"));
        assertEquals("html", outputHtml.get("method"));
    }

    @Test
    public void outputXmlTest() {
        Map<String, String> outputXml = W3CDom.OutputXml();
        assertEquals(1, outputXml.size());
        assertTrue(outputXml.containsKey("method"));
        assertEquals("xml", outputXml.get("method"));
    }

}