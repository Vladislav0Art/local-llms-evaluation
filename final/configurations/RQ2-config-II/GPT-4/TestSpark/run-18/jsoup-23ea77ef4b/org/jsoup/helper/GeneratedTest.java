package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.W3CDom;
import org.w3c.dom.NodeList;

import java.util.List;
import java.util.HashMap;

import org.jsoup.Jsoup;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareBooleanTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.namespaceAware(true);
        assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void convertDocumentTest() {
        Document document = Jsoup.parse("<html></html>");
        assertNotNull(W3CDom.convert(document));
    }

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document document = Jsoup.parse("<html></html>");
        assertNotNull(w3cDom.fromJsoup(document));
    }

    @Test
    public void fromJsoupElementTest() {
        W3CDom w3cDom = new W3CDom();
        Element element = new Element("p");
        assertNotNull(w3cDom.fromJsoup(element));
    }

    @Test
    public void contextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document document = W3CDom.convert(Jsoup.parse("<html></html>"));
        assertNotNull(w3cDom.contextNode(document));
    }

    @Test
    public void asStringTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document document = W3CDom.convert(Jsoup.parse("<html></html>"));
        assertNotNull(w3cDom.asString(document));
    }

    @Test
    public void asStringPropertiesTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document document = W3CDom.convert(Jsoup.parse("<html></html>"));
        HashMap<String, String> properties = new HashMap<>();
        properties.put("property1", "value1");
        assertNotNull(W3CDom.asString(document, properties));
    }

    @Test
    public void outputHtmlTest() {
        assertNotNull(W3CDom.OutputHtml());
    }

    @Test
    public void outputXmlTest() {
        assertNotNull(W3CDom.OutputXml());
    }

    @Test
    public void selectXpathTest() {
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document document = W3CDom.convert(Jsoup.parse("<html><body><div><p>Hello World</p></div></body></html>"));
        NodeList nodeList = w3cDom.selectXpath("//div", document);
        assertNotNull(nodeList);
        assertEquals(1, nodeList.getLength());
    }

}