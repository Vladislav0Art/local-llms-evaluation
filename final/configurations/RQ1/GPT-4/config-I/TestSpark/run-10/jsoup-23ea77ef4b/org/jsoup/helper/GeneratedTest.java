package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void convertTest() {
        Document document = new Document("");
        W3CDom w3cDom = new W3CDom();
        assertNotNull(W3CDom.convert(document));
    }

    @Test
    public void asStringTest() {
        Document document = new Document("");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document convertedDoc = W3CDom.convert(document);
        assertNotNull(w3cDom.asString(convertedDoc));
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("test", "value");
        assertNotNull(W3CDom.propertiesFromMap(map));
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
    public void fromJsoupTest() {
        Document document = new Document("");
        W3CDom w3cDom = new W3CDom();
        assertNotNull(w3cDom.fromJsoup(document));
    }

    @Test
    public void selectXpathTest() {
        Document document = new Document("");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document convertedDoc = W3CDom.convert(document);
        NodeList nodeList = w3cDom.selectXpath("/", convertedDoc);
        assertNotNull(nodeList);
    }

    @Test
    public void sourceNodesTest() {
        Document document = new Document("");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document convertedDoc = W3CDom.convert(document);
        NodeList nodeList = w3cDom.selectXpath("/", convertedDoc);
        assertNotEquals(0, w3cDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class).size());
    }

}