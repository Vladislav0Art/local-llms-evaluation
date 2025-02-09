package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAware_AfterSettingToTrue_ReturnsTrue() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(true);
        assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document jsoupDoc = new Document();
        org.w3c.dom.Document document = W3CDom.convert(jsoupDoc);
        assertNotNull(document);
    }

    @Test
    public void asStringTest() {
        Document jsoupDoc = new Document();
        org.w3c.dom.Document document = W3CDom.convert(jsoupDoc);
        String result = W3CDom.asString(document, W3CDom.OutputHtml());
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> outputParams = W3CDom.OutputHtml();
        Properties result = W3CDom.propertiesFromMap(outputParams);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void contextNodeTest() {
        Document jsoupDoc = new Document();
        org.w3c.dom.Document document = W3CDom.convert(jsoupDoc);
        W3CDom w3cDom = new W3CDom();
        Node result = w3cDom.contextNode(document);
        assertNotNull(result);
    }

    @Test
    public void selectXpathTest() {
        Document jsoupDoc = new Document();
        org.w3c.dom.Document document = W3CDom.convert(jsoupDoc);
        W3CDom w3cDom = new W3CDom();
        NodeList result = w3cDom.selectXpath("/html/body", document);
        assertNotNull(result);
    }

}