package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void namespaceAwareDefaultTest() {
        assertTrue(W3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareFalseTest() {
        assertFalse(W3CDom.namespaceAware(false));
    }

    @Test
    public void convertDocumentTest() {
        String html = "<html><body>Hello World!</body></html>";
        Document doc = org.jsoup.Jsoup.parse(html);
        Document convertedDoc = W3CDom.convert(doc);
        assertNotNull(convertedDoc);
    }

    @Test
    public void asStringTest() {
        String expectedOutput = "Hello World!";
        Document doc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        assertEquals(expectedOutput, W3CDom.asString(doc));
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("prop1", "value1");
        Properties properties = W3CDom.propertiesFromMap(map);
        assertNotNull(properties);
    }

    @Test
    public void OutputHtmlTest() {
        Document doc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        HashMap<String, String> output = W3CDom.OutputHtml();
        assertNotNull(output);
    }

    @Test
    public void OutputXmlTest() {
        Document doc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        HashMap<String, String> output = W3CDom.OutputXml();
        assertNotNull(output);
    }

    @Test
    public void fromJsoupDocumentTest() {
        Document soupDoc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        Document convertedDoc = W3CDom.fromJsoup(soupDoc);
        assertNotNull(convertedDoc);
    }

    @Test
    public void fromJsoupElementTest() {
        org.jsoup.nodes.Element element = org.jsoup.Jsoup.parse("<p>Hello World!</p>").get(0).selectFirst("p");
        Document convertedDoc = W3CDom.fromJsoup(element);
        assertNotNull(convertedDoc);
    }

    @Test
    public void convertDocumentTest2() {
        String html = "<html><body>Hello World!</body></html>";
        org.jsoup.nodes.Document in = org.jsoup.Jsoup.parse(html);
        Document out = new org.jsoup.internal.Parser().parse(in, "html");
        W3CDom.convert(in, out);
        assertNotNull(out);
    }

    @Test
    public void convertElementTest2() {
        org.jsoup.nodes.Element element = org.jsoup.Jsoup.parse("<p>Hello World!</p>").get(0).selectFirst("p");
        Document out = new org.jsoup.internal.Parser().parse(element, "html");
        W3CDom.convert(element, out);
        assertNotNull(out);
    }

    @Test
    public void selectXpathDocumentTest() {
        String xpath = "//body";
        Document doc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        NodeList nodeList = doc.selectXpath(xpath);
        assertNotNull(nodeList);
    }

    @Test
    public void selectXpathElementTest() {
        String xpath = "//body";
        Node contextNode = new org.jsoup.nodes.Document().get(0).selectFirst("body");
        NodeList nodeList = contextNode.selectXpath(xpath);
        assertNotNull(nodeList);
    }

    @Test
    public void sourceNodesDocumentTest() {
        NodeList nodeList = new org.jsoup.internal.Parser().parse("<html><body>Hello World!</body></html>", "html").get(0).selectFirst("body");
        List<org.jsoup.nodes.Node> nodes = W3CDom.sourceNodes(nodeList, org.jsoup.nodes.Node.class);
        assertNotNull(nodes);
    }

    @Test
    public void contextNodeDocumentTest() {
        Document wDoc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        Node contextNode = W3CDom.contextNode(wDoc);
        assertNotNull(contextNode);
    }

    @Test
    public void asStringDocumentTest() {
        String expectedOutput = "Hello World!";
        Document doc = org.jsoup.Jsoup.parse("<html><body>Hello World!</body></html>");
        assertEquals(expectedOutput, W3CDom.asString(doc));
    }

}