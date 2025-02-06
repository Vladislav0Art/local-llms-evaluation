package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void namespaceAware_TrueTest() {
        boolean result = W3CDom.namespaceAware();
        assertTrue(result);
    }

    @Test
    public void namespaceAware_FalseTest() {
        boolean result = W3CDom.namespaceAware(false);
        assertFalse(result);
    }

    @Test
    public void namespaceAware_SetExplicitlyTest() {
        boolean result = W3CDom.namespaceAware(true);
        assertTrue(result);
    }

    @Test
    public void convert_FromJsoup_DocumentTest() {
        Document in = new Document();
        Document out = W3CDom.convert(in);
        assertNotNull(out);
    }

    @Test
    public void asString_FromDocument

    Test() {
        Map<String, String> properties = null;
        Document doc = W3CDom.asString(null, null);
        assertNotNull(doc);
    }

    @Test
    public void propertiesFromMap

    Test() {
        Map<String, String> map = new HashMap<>();
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

    @Test
    public void OutputHtml_HashMapTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
    }

    @Test
    public void OutputXml_HashMapTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
    }

    @Test
    public void fromJsoup_FromDocumentTest() {
        Document in = new Document();
        Document out = W3CDom.fromJsoup(in);
        assertNotNull(out);
    }

    @Test
    public void fromJsoup_FromElementTest() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document out = W3CDom.fromJsoup(in);
        assertNotNull(out);
    }

    @Test
    public void convert_FromDocument_DocumentTest() {
        Document in = new Document();
        Document out = W3CDom.convert(in);
        assertNotNull(out);
    }

    @Test
    public void convert_FromElement_DocumentTest() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        Document out = W3CDom.convert(in);
        assertNotNull(out);
    }

    @Test
    public void selectXpath_XPathAndDocumentTest() {
        String xpath = "/*";
        Document doc = new Document();
        NodeList result = W3CDom.selectXpath(xpath, doc);
        assertNotNull(result);
    }

    @Test
    public void selectXpath_XPathAndNodeTest() {
        String xpath = "//div";
        Node contextNode = new org.jsoup.nodes.Document().selectFirst("div").get(0);
        NodeList result = W3CDom.selectXpath(xpath, contextNode);
        assertNotNull(result);
    }

    @Test
    public void sourceNodes_DocumentAndNodeTypeTest() {
        Document in = new Document();
        NodeList nodeList = new NodeList();
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(result);
    }

    @Test
    public void contextNode_FromDocumentTest() {
        Document wDoc = new Document();
        Node result = W3CDom.contextNode(wDoc);
        assertNotNull(result);
    }

    @Test
    public void asString_FromDocumentWithPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        Document doc = W3CDom.asString(doc, properties);
        assertNotNull(doc);
    }

    @Test
    public void asString_FromDocumentWithoutPropertiesTest() {
        Document doc = W3CDom.asString(doc, null);
        assertNotNull(doc);
    }

}