package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;
import org.w3c.dom.NodeList;

import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        Assert.assertTrue(true == w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSettingTest() {
        W3CDom w3CDom = new W3CDom();
        W3CDom result = w3CDom.namespaceAware(true);
        Assert.assertNotNull(result);
        Assert.assertTrue(true == result.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document jsoupDocument = new Document("");
        org.w3c.dom.Document result = W3CDom.convert(jsoupDocument);
        Assert.assertNotNull(result);
    }

    @Test
    public void asStringTest() {
        Document jsoupDocument = new Document("");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(jsoupDocument);
        String str = W3CDom.asString(w3cDoc, W3CDom.OutputHtml());
        Assert.assertNotNull(str);
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> htmlProperties = W3CDom.OutputHtml();
        Assert.assertNotNull(htmlProperties);
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> xmlProperties = W3CDom.OutputXml();
        Assert.assertNotNull(xmlProperties);
    }

    @Test
    public void fromJsoupDocumentTest() {
        Document jsoupDocument = new Document("");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document result = w3CDom.fromJsoup(jsoupDocument);
        Assert.assertNotNull(result);
    }

    @Test
    public void fromJsoupElementTest() {
        Element element = new Element("test");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document result = w3CDom.fromJsoup(element);
        Assert.assertNotNull(result);
    }

}