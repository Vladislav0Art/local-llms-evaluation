package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeList;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareWithParamTest() {
        W3CDom w3CDom = new W3CDom();
        W3CDom result = w3CDom.namespaceAware(true);
        assertTrue(result.namespaceAware());
    }

    @Test
    public void convertWithDocumentTest() {
        W3CDom w3CDom = new W3CDom();
        Document doc = new Document();
        Document result = w3CDom.convert(doc);
        assertNotNull(result);
    }

    @Test
    public void asStringWithDocumentAndMapTest() {
        W3CDom w3CDom = new W3CDom();
        Document doc = new Document();
        Map<String, String> map = new HashMap<>();
        String result = w3CDom.asString(doc, map);
        assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        W3CDom w3CDom = new W3CDom();
        Map<String, String> map = new HashMap<>();
        Properties result = w3CDom.propertiesFromMap(map);
        assertNotNull(result);
    }

}