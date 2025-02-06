package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAware_ReturnsTrue() {
        assertTrue(W3CDom.namespaceAware());
    }

    @Test
    public void namespaceAware_NamespaceAwareSet_ReturnsFalse() {
        assertFalse(W3CDom.namespaceAware(false));
    }

    @Test
    public void convert_DocumentToDocument() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        Document expectedDoc = new org.jsoup.internal.JsoupInternalDocument();
        Document actualDoc = W3CDom.convert(document);
        assertEquals(expectedDoc, actualDoc);
    }

    @Test
    public void asString_DocumentToString() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        String expectedString = "some string";
        String actualString = W3CDom.asString(document, null);
        assertTrue(actualString.contains(expectedString));
    }

    @Test
    public void propertiesFromMap_MockPropertiesFromMap() {
        Map<String, String> map = new HashMap<>();
        Properties expectedProperties = new Properties();
        W3CDom.propertiesFromMap(map);
        assertEquals(expectedProperties, W3CDom.propertiesFromMap(map));
    }

    @Test
    public void OutputHtml_HtmlOutput() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        HashMap<String, String> expectedHtml = new HashMap<>();
        W3CDom.OutputHtml(document);
        assertEquals(expectedHtml, W3CDom.OutputHtml(document));
    }

    @Test
    public void OutputXml_XmlOutput() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        HashMap<String, String> expectedXml = new HashMap<>();
        W3CDom.OutputXml(document);
        assertEquals(expectedXml, W3CDom.OutputXml(document));
    }

    @Test
    public void fromJsoup_DocumentFromDocument() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        Document expectedDoc = new org.jsoup.internal.JsoupInternalDocument();
        Document actualDoc = W3CDom.fromJsoup(document);
        assertEquals(expectedDoc, actualDoc);
    }

    @Test
    public void fromJsoup_ElementFromElement() {
        Element element = new org.jsoup.internal.JsoupInternalElement();
        Document expectedDoc = new org.jsoup.internal.JsoupInternalDocument();
        Document actualDoc = W3CDom.fromJsoup(element);
        assertEquals(expectedDoc, actualDoc);
    }

    @Test
    public void convert_DocumentToDocumentIn() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        Document outDoc = new org.jsoup.internal.JsoupInternalDocument();
        W3CDom.convert(document, outDoc);
        assertNotNull(outDoc);
    }

    @Test
    public void convert_ElementToDocumentIn() {
        Element element = new org.jsoup.internal.JsoupInternalElement();
        Document outDoc = new org.jsoup.internal.JsoupInternalDocument();
        W3CDom.convert(element, outDoc);
        assertNotNull(outDoc);
    }

    @Test
    public void selectXpath_XPathStringFromDocument() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        NodeList expectedNodeList = new org.jsoup.internal.JsoupInternalNodeList();
        NodeList actualNodeList = W3CDom.selectXpath("xpath", document);
        assertEquals(expectedNodeList, actualNodeList);
    }

    @Test
    public void selectXpath_XPathStringFromContext() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        Element contextElement = new org.jsoup.internal.JsoupInternalElement();
        NodeList expectedNodeList = new org.jsoup.internal.JsoupInternalNodeList();
        NodeList actualNodeList = W3CDom.selectXpath("xpath", contextElement);
        assertEquals(expectedNodeList, actualNodeList);
    }

    @Test
    public void sourceNodes_NodeListFromNodeType() {
        NodeList nodeList = new org.jsoup.internal.JsoupInternalNodeList();
        List<org.jsoup.nodes.Node> expectedSourceNodes = new ArrayList<>();
        List<org.jsoup.nodes.Node> actualSourceNodes = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertEquals(expectedSourceNodes, actualSourceNodes);
    }

    @Test
    public void contextNode_DocumentContext() {
        Document wDoc = new org.jsoup.internal.JsoupInternalDocument();
        Node expectedContextNode = new org.jsoup.internal.JsoupInternalNode();
        Node actualContextNode = W3CDom.contextNode(wDoc);
        assertEquals(expectedContextNode, actualContextNode);
    }

    @Test
    public void asString_DocumentAsDocument() {
        Document document = new org.jsoup.internal.JsoupInternalDocument();
        String expectedString = "some string";
        String actualString = W3CDom.asString(document);
        assertTrue(actualString.contains(expectedString));
    }

}