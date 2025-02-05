package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void W3CDomConstructorTest() {
        W3CDom w3CDom = new W3CDom();
        assertNotNull(w3CDom);
    }

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        boolean namespaceAware = w3CDom.namespaceAware();
        assertFalse(namespaceAware);
    }

    @Test
    public void namespaceAwareSetTrueTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(true);
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document doc = new Document("test");
        org.w3c.dom.Document result = W3CDom.convert(doc);
        assertNotNull(result);
    }

    @Test
    public void asStringTestWithProperties() {
        org.w3c.dom.Document doc = // create an instance
        Map<String, String> properties = new HashMap<>();
        properties.put("prop", "value");
        String result = W3CDom.asString(doc, properties);
        assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("prop", "value");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertEquals("value", properties.getProperty("prop"));
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        assertNotNull(outputHtml);
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        assertNotNull(outputXml);
    }

    @Test
    public void fromJsoupDocumentTest() {
        Document doc = new Document("test");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document result = w3CDom.fromJsoup(doc);
        assertNotNull(result);
    }

    @Test
    public void fromJsoupElementTest() {
        Element element = new Element("div");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document result = w3CDom.fromJsoup(element);
        assertNotNull(result);
    }

}