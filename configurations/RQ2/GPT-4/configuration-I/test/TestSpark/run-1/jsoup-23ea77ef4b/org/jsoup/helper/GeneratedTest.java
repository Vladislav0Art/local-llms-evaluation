package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(true);
        Assert.assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body></body></html>");
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        Assert.assertNotNull(w3cDoc);
    }

    @Test
    public void asStringTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body></body></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        String docAsString = w3cDom.asString(w3cDoc);
        Assert.assertNotNull(docAsString);
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        Assert.assertNotNull(outputHtml);
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        Assert.assertNotNull(outputXml);
    }

    @Test
    public void fromJsoupDocumentTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body></body></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        Assert.assertNotNull(w3cDoc);
    }

    @Test
    public void fromJsoupElementTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body></body></html>");
        Element bodyEl = jsoupDoc.body();
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(bodyEl);
        Assert.assertNotNull(w3cDoc);
    }

    @Test
    public void selectXpathTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body></body></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        NodeList nodeList = w3cDom.selectXpath("//title", w3cDoc);
        Assert.assertNotNull(nodeList);
    }

    @Test
    public void contextNodeTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body></body></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        Node node = w3cDom.contextNode(w3cDoc);
        Assert.assertNotNull(node);
    }

    @Test
    public void asStringWithPropertiesTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>Test</title></head><body></body></html>");
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        Map<String, String> properties = new HashMap<>();
        properties.put("xml-declaration", "true");
        W3CDom w3cDom = new W3CDom();
        String docAsString = w3cDom.asString(w3cDoc, properties);
        Assert.assertNotNull(docAsString);
    }

}