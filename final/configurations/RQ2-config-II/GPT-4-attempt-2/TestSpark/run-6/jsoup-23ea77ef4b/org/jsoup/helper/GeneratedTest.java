package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.helper.W3CDom;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareDefaultTest() {
        W3CDom w3cDom = new W3CDom();
        Assert.assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareTrueTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(true);
        Assert.assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareFalseTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(false);
        Assert.assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void asStringDocumentTest() throws ParserConfigurationException {
        Document doc = new Document("");
        W3CDom w3cDom = new W3CDom();
        Assert.assertNotNull(w3cDom.asString(doc));
    }

    @Test
    public void asStringDocumentWithPropertiesTest() throws ParserConfigurationException {
        Document doc = new Document("");
        W3CDom w3cDom = new W3CDom();
        Map<String, String> properties = new HashMap<>();
        properties.put("encoding", "UTF-8");
        Assert.assertNotNull(w3cDom.asString(doc, properties));
    }

    @Test
    public void convertFromJsoupTest() {
        Document doc = mock(Document.class);
        W3CDom w3cDom = new W3CDom();
        Assert.assertNotNull(w3cDom.fromJsoup(doc));
    }

    @Test
    public void selectXpathTest() {
        org.w3c.dom.Document doc = mock(org.w3c.dom.Document.class);
        W3CDom w3cDom = new W3CDom();
        NodeList nodeList = mock(NodeList.class);
        when(w3cDom.selectXpath(anyString(), anyObject())).thenReturn(nodeList);
        NodeList result = w3cDom.selectXpath("//*", doc);
        Assert.assertNotNull(result);
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Assert.assertEquals(2, W3CDom.propertiesFromMap(map).size());
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        Assert.assertNotNull(outputHtml);
        Assert.assertTrue(outputHtml.containsKey("method"));
        Assert.assertEquals("html", outputHtml.get("method"));
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        Assert.assertNotNull(outputXml);
        Assert.assertTrue(outputXml.containsKey("method"));
        Assert.assertEquals("xml", outputXml.get("method"));
    }

}