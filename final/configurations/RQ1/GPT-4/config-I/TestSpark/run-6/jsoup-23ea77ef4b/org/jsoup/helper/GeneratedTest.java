package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareDefaultTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSettingFalseTest() {
        W3CDom w3CDom = new W3CDom()
                .namespaceAware(false);
        assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void convertToW3CDocumentTest() throws Exception {
        String html = "<div><p>hello world</p></div>";
        Document doc = W3CDom.convert(org.jsoup.Jsoup.parse(html));
        assertNotNull(doc.getElementsByTagName("p").item(0));
    }

    @Test
    public void asStringWithNullPropertiesTest() throws Exception {
        String html = "<div><p>hello world</p></div>";
        Document doc = W3CDom.convert(org.jsoup.Jsoup.parse(html));
        String result = W3CDom.asString(doc, null);
        assertTrue(result.contains("hello world"));
    }

    @Test
    public void outputHtmlTest() {
        Map<String, String> outputHtml = W3CDom.OutputHtml();
        assertNotNull(outputHtml);
        assertEquals("html", outputHtml.get("method"));
    }

    @Test
    public void outputXmlTest() {
        Map<String, String> outputXml = W3CDom.OutputXml();
        assertNotNull(outputXml);
        assertEquals("xml", outputXml.get("method"));
    }

    @Test
    public void fromJsoupNoContextTest() throws Exception {
        String html = "<div><p>hello world</p></div>";
        Document doc = new W3CDom().fromJsoup(org.jsoup.Jsoup.parse(html));
        assertNotNull(doc.getElementsByTagName("p").item(0));
    }

    @Test
    public void asStringWithoutPropertiesTest() throws Exception {
        String html = "<div><p>hello world</p></div>";
        Document doc = new W3CDom().fromJsoup(org.jsoup.Jsoup.parse(html));
        String result = new W3CDom().asString(doc);
        assertTrue(result.contains("hello world"));
    }

    @Test
    public void asStringWithPropertiesTest() {
        String html = "<div><p>hello world</p></div>";
        Document doc = new W3CDom().fromJsoup(org.jsoup.Jsoup.parse(html));
        String result = new W3CDom().asString(doc, W3CDom.OutputHtml());
        assertTrue(result.contains("hello world"));
    }

    @Test
    public void selectXpathFromDocumentTest() {
        String html = "<div><p>hello world</p></div>";
        Document doc = W3CDom.convert(org.jsoup.Jsoup.parse(html));
        Node node = (Node) new W3CDom().selectXpath("/html/body/div/p", doc).item(0);
        assertEquals("p", node.getNodeName());
    }

}