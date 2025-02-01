package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom dom = new W3CDom();
        assertTrue(dom.namespaceAware());

        dom.namespaceAware(false);
        assertFalse(dom.namespaceAware());

        dom.namespaceAware(true);
        assertTrue(dom.namespaceAware());
    }

    @Test
    public void convertTest() {
        Document jsoupDocument = new Document("https://www.example.org");

        org.w3c.dom.Document w3cDocument = W3CDom.convert(jsoupDocument);
        assertNotNull(w3cDocument);
        assertEquals(jsoupDocument.baseUri(), w3cDocument.getDocumentURI());
    }

    @Test
    public void asStringTest() {
        Document jsoupDocument = new Document("https://www.example.org");
        org.w3c.dom.Document w3cDocument = W3CDom.convert(jsoupDocument);

        String documentStr = W3CDom.asString(w3cDocument, null);
        assertNotNull(documentStr);
        assertTrue(documentStr.contains("https://www.example.org"));
    }

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        Properties properties = W3CDom.propertiesFromMap(map);
        assertEquals(map.size(), properties.size());
        for (String key : map.keySet()) {
            assertEquals(map.get(key), properties.getProperty(key));
        }
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> outputHtmlMap = W3CDom.OutputHtml();
        assertEquals("html", outputHtmlMap.get("method"));
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> outputXmlMap = W3CDom.OutputXml();
        assertEquals("xml", outputXmlMap.get("method"));
    }

    @Test
    public void fromJsoupTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDocument = new Document("https://www.example.org");
        Element element = new Element("SomeElement");
        jsoupDocument.appendChild(element);

        org.w3c.dom.Document w3cDocument = dom.fromJsoup(jsoupDocument);
        assertNotNull(w3cDocument);
        assertEquals(jsoupDocument.baseUri(), w3cDocument.getDocumentURI());
        assertSame(w3cDocument.getUserData("jsoupSource"), element);
    }

    @Test
    public void convertFromElementTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDocument = new Document("https://www.example.org");
        Element element = new Element("SomeElement");
        jsoupDocument.appendChild(element);

        org.w3c.dom.Document w3cDocument = W3CDom.convert(jsoupDocument);
        dom.convert(element, w3cDocument);

        Node w3cNode = dom.contextNode(w3cDocument);
        assertNotNull(w3cNode);
        assertSame(w3cNode.getUserData("jsoupSource"), element);
    }

    @Test
    public void contextNodeTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDocument = new Document("https://www.example.org/");
        org.w3c.dom.Document w3cDocument = dom.fromJsoup(jsoupDocument);

        Node w3cNode = dom.contextNode(w3cDocument);
        assertNotNull(w3cNode);
        assertEquals(w3cNode.getUserData("jsoupSource"), jsoupDocument.child(0));
    }

    @Test
    public void sourceNodesTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDocument = new Document("https://www.example.org/");
        Element element = new Element("ExampleElement");
        jsoupDocument.appendChild(element);

        org.w3c.dom.Document w3cDocument = dom.fromJsoup(jsoupDocument);
        org.w3c.dom.NodeList nodeList = w3cDocument.getChildNodes();

        List<Element> sourceNodes = dom.sourceNodes(nodeList, Element.class);
        assertEquals(1, sourceNodes.size());
        assertEquals(element, sourceNodes.get(0));
    }

}