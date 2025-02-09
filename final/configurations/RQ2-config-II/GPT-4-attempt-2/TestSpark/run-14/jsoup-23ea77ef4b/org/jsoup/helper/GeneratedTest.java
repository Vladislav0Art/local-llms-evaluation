package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareTrueTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(true);
        assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document document = new Document();
        assertNotNull(w3cDom.fromJsoup(document));
    }

    @Test
    public void fromJsoupElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = new Element();
        assertNotNull(w3cDom.fromJsoup(element));
    }

    @Test
    public void convertDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document document = new Document();
        Document wDocument = Mockito.mock(Document.class);
        w3cDom.convert(document, wDocument);
        Mockito.verify(wDocument, Mockito.times(1)).appendChild(Mockito.any());
    }

    @Test
    public void convertElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = new Element("test");
        Document wDocument = Mockito.mock(Document.class);
        w3cDom.convert(element, wDocument);
        Mockito.verify(wDocument, Mockito.times(1)).appendChild(Mockito.any());
    }

    @Test
    public void asStringWithPropertiesTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document wDocument = Mockito.mock(org.w3c.dom.Document.class);
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        assertNotNull(w3cDom.asString(wDocument, properties));
    }

    @Test
    public void asStringWithoutPropertiesTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document wDocument = Mockito.mock(org.w3c.dom.Document.class);
        assertNotNull(w3cDom.asString(wDocument));
    }

    @Test
    public void OutputHtmlTest() {
        assertNotNull(W3CDom.OutputHtml());
    }

    @Test
    public void OutputXmlTest() {
        assertNotNull(W3CDom.OutputXml());
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("testKey", "testValue");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
        assertEquals("testValue", properties.getProperty("testKey"));
    }

}