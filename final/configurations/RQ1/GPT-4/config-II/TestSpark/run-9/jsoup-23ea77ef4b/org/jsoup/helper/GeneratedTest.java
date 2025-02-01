package org.jsoup.helper;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareDefaultTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareFalseTest() {
        W3CDom w3CDom = new W3CDom();
        assertFalse(w3CDom.namespaceAware(false).namespaceAware());
    }

    @Test
    public void namespaceAwareTrueTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware(true).namespaceAware());
    }

    @Test
    public void convertNullTest() {
        Document result = W3CDom.convert(null);
        assertNull(result);
    }

    @Test
    public void convertDocumentTest() {
        Node node = new Node("test");
        Document result = W3CDom.convert(node);
        assertNotNull(result);
    }

    @Test
    public void asStringNullPropertiesTest() {
        Document doc = W3CDom.convert(new Node("test"));
        String result = W3CDom.asString(doc, null);
        assertNotNull(result);
    }

    @Test
    public void asStringNullDocumentTest() {
        String result = W3CDom.asString(null, null);
        assertNull(result);
    }

    @Test
    public void asStringWithPropertiesTest() {
        Document doc = W3CDom.convert(new Node("test"));
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        String result = W3CDom.asString(doc, properties);
        assertNotNull(result);
    }

    @Test
    public void fromJsoupNullTest() {
        W3CDom w3CDom = new W3CDom();
        Document result = w3CDom.fromJsoup(null);
        assertNull(result);
    }

    @Test
    public void fromJsoupElementTest() {
        W3CDom w3CDom = new W3CDom();
        Node element = new Node("test");
        Document result = w3CDom.fromJsoup(element);
        assertNotNull(result);
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
        assertEquals("html", result.get("method"));
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertNotNull(result);
        assertEquals("xml", result.get("method"));
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Properties result = W3CDom.propertiesFromMap(map);
        assertNotNull(result);
        assertEquals("value", result.getProperty("key"));
    }

}