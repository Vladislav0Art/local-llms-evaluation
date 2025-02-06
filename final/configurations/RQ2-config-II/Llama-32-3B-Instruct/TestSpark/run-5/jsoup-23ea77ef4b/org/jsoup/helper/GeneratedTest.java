package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void namespaceAware_isFalseByDefault() {
        assertTrue(W3CDom.namespaceAware());
    }

    @Test
    public void namespaceAware_setToTrue() {
        assertFalse(W3CDom.namespaceAware(false));
        assertTrue(W3CDom.namespaceAware(true));
    }

    @Test
    public void convert_jsoupDocument_toW3CDoc() throws Exception {
        Document doc = new org.w3c.dom.Document();
        Document wDoc = W3CDom.convert(new org.jsoup.nodes.Document());
        assertNotNull(wDoc);
    }

    @Test
    public void asString_document_withProperties() {
        Map<String, String> properties = new HashMap<>();
        properties.put("property", "value");
        assertEquals("<document property=\"value\"/>", W3CDom.asString(
                new org.w3c.dom.Document(),
                properties));
    }

    @Test
    public void asString_document_withoutProperties() {
        Document doc = new org.w3c.dom.Document();
        assertEquals("", W3CDom.asString(doc));
    }

    @Test
    public void OutputHtml() {
        Properties expectedOutput = new Properties();
        expectedOutput.put("html", "<html>...</html>");
        HashMap<String, String> output = W3CDom.OutputHtml();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void OutputXml() {
        Properties expectedOutput = new Properties();
        expectedOutput.put("xml", "<xml>...</xml>");
        HashMap<String, String> output = W3CDom.OutputXml();
        assertEquals(expectedOutput, output);
    }

    @Test
    public void fromJsoup_document() throws Exception {
        Document jsDoc = new org.jsoup.nodes.Document();
        Document wDoc = W3CDom.fromJsoup(jsDoc);
        assertNotNull(wDoc);
    }

    @Test
    public void fromJsoup_element() throws Exception {
        Element jsElement = new org.jsoup.nodes.Element();
        Document wDoc = W3CDom.fromJsoup(jsElement);
        assertNotNull(wDoc);
    }

    @Test
    public void convert_jsoupElement_toW3CDoc() throws Exception {
        org.jsoup.nodes.Element jsElement = new org.jsoup.nodes.Element();
        Document wDoc = W3CDom.convert(jsElement);
        assertNotNull(wDoc);
    }

    @Test
    public void convert_element_toJsoupDocument() throws Exception {
        Document doc = new org.w3c.dom.Document();
        W3CDom.convert(doc, new org.jsoup.nodes.Document());
    }

    @Test
    public void selectXpath_xpathIsEmpty() {
        NodeList nodeList = W3CDom.selectXpath("", new org.w3c.dom.Document());
        assertTrue(nodeList.getLength() == 0);
    }

    @Test
    public void selectXpath_xpathIsNotMatchingAnyNode() throws Exception {
        Document doc = new org.w3c.dom.Document();
        NodeList nodeList = W3CDom.selectXpath("nonExistentXPath", doc);
        assertEquals(0, nodeList.getLength());
    }

    @Test
    public void sourceNodes_nodeList_isEmpty() {
        NodeList nodeList = Mockito.mock(NodeList.class);
        List<org.jsoup.nodes.Node> nodes = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertTrue(nodes.isEmpty());
    }

    @Test
    public void contextNode_documentIsDocumentType() {
        Document doc = new org.w3c.dom.Document();
        Node context = W3CDom.contextNode(doc);
        assertEquals(doc, context);
    }

}