package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void W3CDomConstructorTest() {
        W3CDom w3cDom = new W3CDom();
        Assert.assertNotNull(w3cDom);
    }

    @Test
    public void NamespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        boolean namespaceAware = w3cDom.namespaceAware();
        Assert.assertFalse(namespaceAware);
    }

    @Test
    public void NamespaceAwareBooleanTest() {
        W3CDom w3cDom = new W3CDom();
        Assert.assertNotNull(w3cDom.namespaceAware(true));
    }

    @Test
    public void ConvertDocumentTest() {
        Document doc = Mockito.mock(Document.class);
        org.w3c.dom.Document result = W3CDom.convert(doc);
        Assert.assertNotNull(result);
    }

    @Test
    public void AsStringWithPropertiesTest() {
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        HashMap<String, String> map = new HashMap<>();
        String result = W3CDom.asString(doc, map);
        Assert.assertTrue(result instanceof String);
    }

    @Test
    public void AsStringTest() {
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        String result = W3CDom.asString(doc);
        Assert.assertTrue(result instanceof String);
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> result = W3CDom.OutputHtml();
        Assert.assertNotNull(result);
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> result = W3CDom.OutputXml();
        Assert.assertNotNull(result);
    }

    @Test
    public void SelectXPathDocumentTest() {
        String xpath = "/test";
        org.w3c.dom.Document doc = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.NodeList result = w3cDom.selectXpath(xpath, doc);
        Assert.assertNotNull(result);
    }

    @Test
    public void SelectXPathNodeTest() {
        String xpath = "/test";
        Node node = Mockito.mock(Node.class);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.NodeList result = w3cDom.selectXpath(xpath, node);
        Assert.assertNotNull(result);
    }

    @Test
    public void FromJsoupDocumentTest() {
        Document doc = Mockito.mock(Document.class);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document result = w3cDom.fromJsoup(doc);
        Assert.assertNotNull(result);
    }

    @Test
    public void FromJsoupElementTest() {
        org.jsoup.nodes.Element element = Mockito.mock(org.jsoup.nodes.Element.class);
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document result = w3cDom.fromJsoup(element);
        Assert.assertNotNull(result);
    }

    @Test
    public void ConvertDocumentToDocumetTest() {
        Document doc = Mockito.mock(Document.class);
        org.w3c.dom.Document outDocument = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(doc, outDocument);
    }

    @Test
    public void ConvertElementDocumentTest() {
        org.jsoup.nodes.Element element = Mockito.mock(org.jsoup.nodes.Element.class);
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(element, document);
    }

    @Test
    public void ContextNodeTest() {
        org.w3c.dom.Document document = Mockito.mock(org.w3c.dom.Document.class);
        W3CDom w3cDom = new W3CDom();
        Node result = w3cDom.contextNode(document);
        Assert.assertNotNull(result);
    }

}