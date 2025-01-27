package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareFalse() {
        boolean result = new W3CDom().namespaceAware(false);
        assertTrue(result);
    }

    @Test
    public void namespaceAwareTrue() {
        boolean result = new W3CDom().namespaceAware(true);
        assertTrue(result);
    }

    @Test
    public void convertFromJsoupDocumentTest() {
        Document soupDoc = new Document();
        Document wDoc = W3CDom.convert(soupDoc);
        assertNotNull(wDoc);
    }

    @Test
    public void convertFromJsoupElementTest() {
        Element element = new Element();
        Document wDoc = W3CDom.fromJsoup(element);
        assertNotNull(wDoc);
    }

    @Test
    public void asStringDocumentTest() {
        Document doc = new Document();
        String result = W3CDom.asString(doc);
        assertNotNull(result);
    }

    @Test
    public void asStringEmptyPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        String result = W3CDom.asString(new Document(), properties);
        assertEquals("", result);
    }

    @Test
    public void asStringNonEmptyPropertiesTest() {
        Map<String, String> properties = new HashMap<>();
        properties.put("key", "value");
        String result = W3CDom.asString(new Document(), properties);
        assertNotNull(result);
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertEquals("", result.get("method"));
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        assertEquals(OutputKeys.METHOD, result.get(METHOD));
    }
}

class Document extends org.jsoup.nodes.Document {
    public Document() {
    }
}

class Element extends org.jsoup.nodes.Element {
    public Element() {
    }

}