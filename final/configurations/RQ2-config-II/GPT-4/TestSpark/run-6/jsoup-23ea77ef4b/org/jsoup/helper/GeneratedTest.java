package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedTest {

    private W3CDom w3CDom = new W3CDom();

    @Test
    public void namespaceAwareTest() {
        boolean result = w3CDom.namespaceAware();
        assertFalse(result);
    }

    @Test
    public void namespaceAwareWithParameterTest() {
        W3CDom result = w3CDom.namespaceAware(true);
        assertTrue(result.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document in = new Document("example");
        W3CDom.convert(in);
    }

    @Test
    public void asStringWithPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        properties.put("prop_1", "value_1");
        W3CDom.asString(null, properties);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("prop_1", "value_1");
        W3CDom.propertiesFromMap(map);
    }

    @Test
    public void outputHtmlTest() {
        W3CDom.OutputHtml();
    }

    @Test
    public void outputXmlTest() {
        W3CDom.OutputXml();
    }

    @Test
    public void fromJsoupDocumentTest() {
        Document in = new Document("example");
        w3CDom.fromJsoup(in);
    }

    @Test
    public void fromJsoupElementTest() {
        Element in = new Element("<p>example</p>");
        w3CDom.fromJsoup(in);
    }

    @Test
    public void convertDocumentTwoParamsTest() {
        Document in = new Document("example");
        W3CDocument out = w3CDom.fromJsoup(in);
        w3CDom.convert(in, out);
    }

    @Test
    public void convertElementTwoParamsTest() {
        Element in = new Element("<p>example</p>");
        W3CDocument out = w3CDom.fromJsoup(in);
        w3CDom.convert(in, out);
    }

    @Test
    public void selectXpathDocumentTest() {
        String xpath = "/example";
        Document in = new Document("example");
        W3CDocument doc = w3CDom.fromJsoup(in);
        w3CDom.selectXpath(xpath, doc);
    }

    @Test
    public void selectXpathNodeTest() {
        String xpath = "/example";
        NodeList nodeList = null;
        w3CDom.selectXpath(xpath, nodeList);
    }

    @Test
    public void contextNodeTest() {
        Document in = new Document("example");
        W3CDocument wDoc = w3CDom.fromJsoup(in);
        w3CDom.contextNode(wDoc);
    }

    @Test
    public void asStringDocumentTest() {
        Document in = new Document("example");
        W3CDocument wDoc = w3CDom.fromJsoup(in);
        w3CDom.asString(wDoc);
    }

}