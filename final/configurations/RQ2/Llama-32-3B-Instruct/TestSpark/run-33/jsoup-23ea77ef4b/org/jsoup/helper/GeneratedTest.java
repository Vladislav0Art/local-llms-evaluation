package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Object o = new W3CDom();
        assertNotNull(o);
    }

    @Test
    public void namespaceAwareTest() {
        boolean result1 = W3CDom.namespaceAware(true);
        boolean result2 = W3CDom.namespaceAware(false);

        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    public void namespaceAwareWithArgumentTest() {
        W3CDom w3cDom = new W3CDom();
        boolean result = w3cDom.namespaceAware(true);

        assertTrue(result);
    }

    @Test
    public void convertFromDocumentTest() {
        org.jsoup.nodes.Document inDoc = new org.jsoup.nodes.Document();
        Document outDoc = W3CDom.convert(inDoc);

        assertNotNull(outDoc);
    }

    @Test
    public void asStringFromDocumentWithPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        properties.put("property1", "value1");

        Document doc = new org.jsoup.nodes.Document();
        String result = W3CDom.asString(doc, properties);

        assertNotNull(result);
    }

    @Test
    public void asStringFromDocumentWithoutPropertiesTest() {
        Document doc = new org.jsoup.nodes.Document();

        String result = W3CDom.asString(doc, null);

        assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        Properties result = W3CDom.propertiesFromMap(map);

        assertNotNull(result);
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();

        assertNotNull(result);
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();

        assertNotNull(result);
    }

    @Test
    public void fromJsoupDocumentTest() {
        org.jsoup.nodes.Document inDoc = new org.jsoup.nodes.Document();
        Document outDoc = W3CDom.fromJsoup(inDoc);

        assertNotNull(outDoc);
    }

    @Test
    public void fromJsoupElementTest() {
        org.jsoup.nodes.Element inElement = new org.jsoup.nodes.Element();
        Document outDoc = W3CDom.fromJsoup(inElement);

        assertNotNull(outDoc);
    }

    @Test
    public void convertDocumentElementTest() {
        org.jsoup.nodes.Document inDoc = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Element inElement = new org.jsoup.nodes.Element();
        Document outDoc = W3CDom.convert(inDoc, inElement);

        assertNotNull(outDoc);
    }

    @Test
    public void convertElementDocumentTest() {
        org.jsoup.nodes.Element inElement = new org.jsoup.nodes.Element();
        Document outDoc = W3CDom.convert(inElement);

        assertNotNull(outDoc);
    }

    @Test
    public void selectXpathWithDocumentAndXpathTest() {
        String xpath = "//div";
        Document doc = new org.jsoup.nodes.Document();
        NodeList nodeList = W3CDom.selectXpath(xpath, doc);

        assertNotNull(nodeList);
    }

    @Test
    public void selectXpathWithContextNodeAndXpathTest() {
        Node contextNode = new org.jsoup.nodes.Element();
        String xpath = "//div";
        NodeList nodeList = W3CDom.selectXpath(xpath, contextNode);

        assertNotNull(nodeList);
    }

    @Test
    public void sourceNodesWithNodeListAndNodeTypeTest() {
        NodeList nodeList = new org.jsoup.nodes.NodeList();
        List<org.jsoup.nodes.Node> result = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);

        assertNotNull(result);
    }

    @Test
    public void contextNodeTest() {
        Document wDoc = new org.jsoup.nodes.Document();

        Node node = W3CDom.contextNode(wDoc);

        assertNotNull(node);
    }

    @Test
    public void asStringWithDocumentAndPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        properties.put("property1", "value1");

        Document doc = new org.jsoup.nodes.Document();
        String result = W3CDom.asString(doc, properties);

        assertNotNull(result);
    }

    @Test
    public void asStringWithDocumentAndNoPropertiesTest() {
        Document doc = new org.jsoup.nodes.Document();

        String result = W3CDom.asString(doc, null);

        assertNotNull(result);
    }

}