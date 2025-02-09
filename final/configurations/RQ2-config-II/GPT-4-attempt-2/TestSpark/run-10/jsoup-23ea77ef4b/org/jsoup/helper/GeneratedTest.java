package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTrueTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(true);
        assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareFalseTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(false);
        assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void convertNotNullParameterTest() throws Exception {
        Document document = ...; // create valid JSoup document
        assertNotNull(W3CDom.convert(document));
    }

    @Test
    public void convertNullParameterTest() throws Exception {
        W3CDom.convert(null);
    }

    @Test
    public void asStringWithPropertiesTest() throws Exception {
        Document document = ...; // create a valid W3C document
        Map<String, String> properties = new HashMap<>();
        properties.put("propKey", "propValue");
        assertNotNull(W3CDom.asString(document, properties));
    }

    @Test
    public void propertiesFromMapNotEmptyMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Properties result = W3CDom.propertiesFromMap(map);
        assertEquals("value", result.getProperty("key"));
    }

    @Test
    public void propertiesFromMapEmptyMapTest() {
        Map<String, String> map = Collections.emptyMap();
        Properties result = W3CDom.propertiesFromMap(map);
        assertTrue(result.isEmpty());
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void fromJsoupDocumentNotNullParameterTest() throws Exception {
        org.jsoup.nodes.Document document = ...; // create valid JSoup document
        W3CDom w3cDom = new W3CDom();
        assertNotNull(w3cDom.fromJsoup(document));
    }

    @Test
    public void convertDocumentNotNullParametersTest() throws Exception {
        org.jsoup.nodes.Document inDocument = ...; // create valid JSoup document
        Document outDocument = ...; // create valid W3C document
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(inDocument, outDocument);
        // verify conversion
    }

    @Test
    public void convertElementNotNullParametersTest() throws Exception {
        org.jsoup.nodes.Element inElement = ...; // create valid JSoup element
        Document outDocument = ...; // create valid W3C document
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(inElement, outDocument);
        // verify conversion
    }

    @Test
    public void selectXpathDocumentNotNullParametersTest() throws Exception {
        Document document = ...; // create valid W3C document with nodes
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = w3cDom.selectXpath("/node/path", document);
        assertNotNull(nodeList);
    }

    @Test
    public void selectXpathNodeNotNullParametersTest() throws Exception {
        Node node = ...; // create valid W3C node with child nodes
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = w3cDom.selectXpath("/child/node/path", node);
        assertNotNull(nodeList);
    }

    @Test
    public void contextNodeNotNullParameterTest() throws Exception {
        Document document = ...; // create valid W3C document
        W3CDom w3cDom = new W3CDom();
        Node result = w3cDom.contextNode(document);
        assertEquals(document, result);
    }

    @Test
    public void asStringNotNullParameterTest() throws Exception {
        Document document = ...; // create valid W3C document
        W3CDom w3cDom = new W3CDom();
        String result = w3cDom.asString(document);
        assertNotNull(result);
    }

}