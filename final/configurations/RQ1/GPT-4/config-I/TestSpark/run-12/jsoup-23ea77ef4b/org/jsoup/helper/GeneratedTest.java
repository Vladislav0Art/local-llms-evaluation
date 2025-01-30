package org.jsoup.helper;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.Map;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void convertTest() {
        Document jsoupDoc = Jsoup.parse("<html></html>");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(jsoupDoc);

        Assert.assertEquals(jsoupDoc.tagName(), w3cDoc.getDocumentElement().getTagName());
    }

    @Test
    public void fromJsoupTest() {
        W3CDom w3cDom = new W3CDom();
        Document jsoupDoc = Jsoup.parse("<html><body><p>Test</p></body></html>");
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Assert.assertEquals(jsoupDoc.child(0).tagName(), w3cDoc.getDocumentElement().getTagName());
    }

    @Test
    public void contextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        Element jsoupElement = Jsoup.parse("<html><body><p>Test</p></body></html>").body();
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupElement);
        Assert.assertNotNull(w3cDom.contextNode(w3cDoc));
    }

    @Test
    public void turnOffNamespaceAwarenessTest() {
        W3CDom w3cDom = new W3CDom();
        Element jsoupElement = Jsoup.parse("<html><body><p>Test</p></body></html>").body();
        w3cDom.namespaceAware(false);
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupElement);
        Assert.assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void selectXPathTest() {
        W3CDom w3cDom = new W3CDom();
        Element jsoupElement = Jsoup.parse("<html><body><p>Test</p></body></html>").body();
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(jsoupElement);
        NodeList nodes = w3cDom.selectXpath("//p", w3cDoc);
        Assert.assertEquals("p", nodes.item(0).getNodeName());
    }

    @Test
    public void asStringTest() {
        W3CDom w3cDom = new W3CDom();
        Document jsoupDoc = Jsoup.parse("<html></html>");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(jsoupDoc);
        String docString = w3cDom.asString(w3cDoc);

        Assert.assertNotNull(docString);
        Assert.assertTrue(docString.length() > 0);
    }

    @Test
    public void outputHtmlTest() {
        Map<String, String> output = W3CDom.OutputHtml();
        Assert.assertTrue(output.size() == 1);
        Assert.assertTrue(output.containsKey("method"));
        Assert.assertEquals("html", output.get("method"));
    }

}