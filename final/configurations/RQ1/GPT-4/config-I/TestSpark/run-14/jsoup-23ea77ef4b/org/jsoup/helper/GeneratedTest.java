package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedTest {

    private static final String INPUT_HTML = "<html><head><title>Title</title></head><body>Body</body></html>";

    @Test
    public void convertTest() {
        Document document = Jsoup.parse(INPUT_HTML);
        org.w3c.dom.Document w3cDocument = W3CDom.convert(document);
        Assert.assertNotNull(w3cDocument);
        Assert.assertEquals("html", w3cDocument.getDocumentElement().getNodeName());
    }

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        Assert.assertTrue(w3CDom.namespaceAware());
        w3CDom.namespaceAware(false);
        Assert.assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void asStringTest() {
        Document document = Jsoup.parse(INPUT_HTML);
        org.w3c.dom.Document w3cDocument = W3CDom.convert(document);
        String documentString = W3CDom.asString(w3cDocument, W3CDom.OutputHtml());
        Assert.assertNotNull(documentString);
        Assert.assertTrue(documentString.contains("<html>"));
    }

    @Test
    public void fromJsoupTest() {
        Document document = Jsoup.parse(INPUT_HTML);
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document w3cDocument = w3CDom.fromJsoup(document);
        Assert.assertNotNull(w3cDocument);
        Assert.assertEquals("html", w3cDocument.getDocumentElement().getNodeName());
    }

    @Test
    public void selectXpathTest() {
        Document document = Jsoup.parse(INPUT_HTML);
        org.w3c.dom.Document w3cDocument = W3CDom.convert(document);
        W3CDom w3CDom = new W3CDom();
        javax.xml.xpath.XPath xpath = javax.xml.xpath.XPathFactory.newInstance().newXPath();
        org.w3c.dom.NodeList result = w3CDom.selectXpath("/html/body", w3cDocument);
        Assert.assertEquals(1, result.getLength());
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        Assert.assertEquals("html", outputHtml.get("method"));
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> outputXml = W3CDom.OutputXml();
        Assert.assertEquals("xml", outputXml.get("method"));
    }

}