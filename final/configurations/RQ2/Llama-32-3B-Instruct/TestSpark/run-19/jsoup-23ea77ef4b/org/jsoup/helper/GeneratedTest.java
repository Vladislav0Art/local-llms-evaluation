package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GeneratedTest {

    @Test
    public void namespaceAwareConstructor_ReturnsFalse() {
        assertFalse(W3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSetter_SetsNamespaceAware() {
        boolean result = new W3CDom().namespaceAware(false);
        assertTrue(result);
    }

    @Test
    public void convertDocument_FromJsoup_ReturnsDocument() {
        Document inDoc = new Document();
        Document outDoc = W3CDom.convert(inDoc);
        assertNotNull(outDoc);
        assertEquals(inDoc, outDoc);
    }

    @Test
    public void asString_DocumentWithProperties_ReturnsStringWithProperties() throws ParserConfigurationException, TransformerException {
        Properties properties = new Properties();
        properties.put("property", "value");
        Document doc = new Document();
        StringWriter writer = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, Syntax);
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        String result = W3CDom.asString(doc, properties);
        assertNotNull(result);
        assertTrue(result.contains("property=value"));
    }

    @Test
    public void OutputHtml_ReturnsHashMap() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void sourceNodes_NoNodeList_SourcesAnEmptyList() {
        NodeList nodeList = null;
        List<Node> result = W3CDom.sourceNodes(nodeList, Document.class);
        assertTrue(result.isEmpty());
    }

    @Test
    public void sourceNodes_EmptyNodeList_SourcesAnEmptyList() {
        NodeList nodeList = new ArrayList<>();
        List<Node> result = W3CDom.sourceNodes(nodeList, Document.class);
        assertTrue(result.isEmpty());
    }

    @Test
    public void selectXpath_XPathWithDocument_ReturnsNodeList() {
        Document doc = new Document();
        NodeList nodeList = W3CDom.selectXpath("//tag", doc);
        assertNotNull(nodeList);
        assertFalse(nodeList.isEmpty());
    }

    @Test
    public void contextNode_DocumentReturnsContextNode() {
        Document doc = new Document();
        Node result = W3CDom.contextNode(doc);
        assertNotNull(result);
        assertTrue(result instanceof Element);
    }

}