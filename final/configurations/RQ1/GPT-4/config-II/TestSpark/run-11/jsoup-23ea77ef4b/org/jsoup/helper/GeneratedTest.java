package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    private W3CDom w3cDom = new W3CDom();

    @Test
    public void namespaceAwareTest() {
        assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSetTest() {
        w3cDom.namespaceAware(false);
        assertFalse(w3cDom.namespaceAware());
    }

    @Test
    public void convertTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document doc = W3CDom.convert(jsoupDoc);

        assertEquals(doc.getDocumentElement().getTagName(), jsoupDoc.child(0).tagName());
    }

    @Test
    public void asStringPropertiesTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document w3cDoc = W3CDom.convert(jsoupDoc);

        Map<String, String> props = new HashMap<>();
        props.put("method", "html");

        assertNotNull(W3CDom.asString(w3cDoc, props));
    }

    @Test
    public void propertiesFromMapTest() {
        Map<String, String> props = new HashMap<>();
        props.put("method", "html");

        assertNotNull(W3CDom.propertiesFromMap(props));
    }

    @Test
    public void OutputHtmlTest() {
        assertNotNull(W3CDom.OutputHtml());
    }

    @Test
    public void OutputXmlTest() {
        assertNotNull(W3CDom.OutputXml());
    }

    @Test
    public void fromJsoupTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        assertEquals(w3cDoc.getDocumentElement().getTagName(), jsoupDoc.child(0).tagName());
    }

    @Test
    public void convertDocumentTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        w3cDom.convert(jsoupDoc, w3cDoc);

        assertEquals(w3cDoc.getDocumentElement().getTagName(), jsoupDoc.child(0).tagName());
    }

    @Test
    public void convertElementTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Element elem = jsoupDoc.body();
        w3cDom.convert(elem, w3cDoc);

        assertEquals(w3cDoc.getDocumentElement().getTagName(), elem.tagName());
    }

    @Test
    public void selectXpathDocumentTest() throws ParserConfigurationException, XPathExpressionException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        NodeList nodeList = w3cDom.selectXpath("//body", w3cDoc);

        assertEquals(nodeList.item(0).getNodeName(), jsoupDoc.body().tagName());
    }

    @Test
    public void selectXpathNodeTest() throws ParserConfigurationException, XPathExpressionException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        NodeList nodeList = w3cDom.selectXpath("//body", w3cDoc.getDocumentElement());

        assertEquals(nodeList.item(0).getNodeName(), jsoupDoc.body().tagName());
    }

    @Test
    public void sourceNodesTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);
        NodeList nodeList = w3cDoc.getElementsByTagName("body");

        List<Element> nodes = w3cDom.sourceNodes(nodeList, Element.class);

        assertEquals(nodes.get(0).tagName(), "body");
    }

    @Test
    public void contextNodeTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        Node node = w3cDom.contextNode(w3cDoc);

        assertEquals(node.getNodeName(), jsoupDoc.body().tagName());
    }

    @Test
    public void asStringTest() throws ParserConfigurationException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document w3cDoc = w3cDom.fromJsoup(jsoupDoc);

        assertNotNull(w3cDom.asString(w3cDoc));
    }

}