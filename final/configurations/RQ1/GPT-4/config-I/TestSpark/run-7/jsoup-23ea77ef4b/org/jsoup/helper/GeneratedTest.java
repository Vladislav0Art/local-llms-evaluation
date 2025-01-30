package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware());

        w3CDom.namespaceAware(false);
        assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void convertTest() {
        final String html = "<html><body>Test</body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document doc = W3CDom.convert(jsoupDoc);

        assertEquals("Test", doc.getElementsByTagName("body").item(0).getTextContent());
    }

    @Test
    public void fromJsoupTest() {
        final String html = "<html><body>Test</body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupDoc);

        assertEquals("Test", doc.getElementsByTagName("body").item(0).getTextContent());
    }

    @Test
    public void fromJsoupElementTest() {
        final String html = "<div>Test</div>";
        Element jsoupElement = Jsoup.parse(html).body().child(0);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupElement);

        assertEquals("Test", doc.getElementsByTagName("div").item(0).getTextContent());
    }

    @Test
    public void convertElementDocumentTest() {
        final String html = "<html><body>Test</body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document w3cDoc = w3CDom.fromJsoup(new Element("dummy"));

        w3CDom.convert(jsoupDoc, w3cDoc);

        assertEquals("Test", w3cDoc.getElementsByTagName("body").item(0).getTextContent());
    }

    @Test
    public void convertElementTest() {
        final String html = "<div>Test</div>";
        Element jsoupElement = Jsoup.parse(html).body().child(0);

        W3CDom w3CDom = new W3CDom();
        Document w3cDoc = w3CDom.fromJsoup(new Element("dummy"));

        w3CDom.convert(jsoupElement, w3cDoc);

        assertEquals("Test", w3cDoc.getElementsByTagName("div").item(0).getTextContent());
    }

    @Test
    public void selectXpathStringDocumentTest() {
        final String html = "<html><body><div>Test</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupDoc);

        NodeList nodeList = w3CDom.selectXpath("//div", doc);

        assertEquals("Test", nodeList.item(0).getTextContent());
    }

    @Test
    public void selectXpathStringNodeTest() {
        final String html = "<html><body><div>Test</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupDoc);
        Node node = doc.getElementsByTagName("body").item(0);

        NodeList nodeList = w3CDom.selectXpath("//div", node);

        assertEquals("Test", nodeList.item(0).getTextContent());
    }

    @Test
    public void sourceNodesTest() {
        final String html = "<html><body><div>Test</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupDoc);
        NodeList nodeList = doc.getElementsByTagName("div");

        assertEquals(1, w3CDom.<Element>sourceNodes(nodeList, Element.class).size());
        assertEquals("div", w3CDom.<Element>sourceNodes(nodeList, Element.class).get(0).nodeName());
        assertEquals("Test", w3CDom.<Element>sourceNodes(nodeList, Element.class).get(0).text());
    }

    @Test
    public void contextNodeTest() {
        final String html = "<html><body><div>Test</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupDoc.child(0));

        assertEquals("html", w3CDom.contextNode(doc).getNodeName());
    }

    @Test
    public void asStringDocumentMapTest() {
        final String html = "<html><body><div>Test</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupDoc);

        HashMap<String, String> properties = new HashMap<>();
        properties.put("doc_type", "html");
        String res = W3CDom.asString(doc, properties);

        assertTrue(res.contains("<div>Test</div>"));
    }

    @Test
    public void asStringDocumentTest() {
        final String html = "<html><body><div>Test</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupDoc);

        String res = w3CDom.asString(doc);

        assertTrue(res.contains("<div>Test</div>"));
    }

    @Test
    public void fromJsoupWithExceptionTest() throws ParserConfigurationException, IOException {
        final String html = "<html><body>Test</body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        org.jsoup.helper.W3CDom spyW3cDom = org.mockito.Mockito.spy(new W3CDom());
        org.mockito.Mockito.doThrow(new ParserConfigurationException()).when(spyW3cDom).fromJsoup(jsoupDoc);
    }

    @Test
    public void asStringWithExceptionTest() throws TransformerConfigurationException {
        final String html = "<html><body>Test</body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        Document document = W3CDom.convert(jsoupDoc);

        HashMap<String, String> properties = new HashMap<>();
        properties.put("doc_type", "html");

        org.jsoup.helper.W3CDom spyW3cDom = org.mockito.Mockito.spy(new W3CDom());
        org.mockito.Mockito.doThrow(new TransformerConfigurationException()).when(spyW3cDom).asString(document, properties);
    }

    @Test
    public void selectXpathStringNodeWithExceptionTest() throws XPathExpressionException, XPathFactoryConfigurationException {
        final String html = "<html><body><div>Test</div></body></html>";
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse(html);

        W3CDom w3CDom = new W3CDom();
        Document doc = w3CDom.fromJsoup(jsoupDoc);
        Node node = doc.getElementsByTagName("body").item(0);

        XPathFactory xPathFactory = org.mockito.Mockito.mock(XPathFactory.class);
        org.mockito.Mockito.when(xPathFactory.newXPath().compile("//div")).thenThrow(new XPathExpressionException("XPathExpressionException"));

        org.jsoup.helper.W3CDom spyW3cDom = org.mockito.Mockito.spy(w3CDom);
        org.mockito.Mockito.doReturn(xPathFactory).when(spyW3cDom).selectXpath("//div", node);
    }

}