package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.xml.transform.TransformerException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3CDom = new W3CDom();
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSettingTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(false);
        assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void convertNullTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>Testing</body></html>");
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        assertNotNull(w3cDoc);
    }

    @Test
    public void asStringPropertiesTest() throws TransformerException {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>Testing</body></html>");
        Document target = W3CDom.convert(jsoupDoc);

        //try with null map
        assertNotNull(W3CDom.asString(target, null));

        //try with html map
        Map<String, String> mapHtml = W3CDom.OutputHtml();
        assertNotNull(W3CDom.asString(target, mapHtml));

        //try with xml map
        Map<String, String> mapXml = W3CDom.OutputXml();
        assertNotNull(W3CDom.asString(target, mapXml));
    }

    @Test
    public void fromJsoupTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>Testing</body></html>");
        W3CDom w3CDom = new W3CDom();
        Document w3cDoc = w3CDom.fromJsoup(jsoupDoc);
        assertNotNull(w3cDoc);
    }

    @Test
    public void convertElementTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>Testing</body></html>");
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        W3CDom w3CDom = new W3CDom();
        Elements elements = jsoupDoc.select("body");
        Element element = elements.first();
        w3CDom.convert(element, w3cDoc);
        assertEquals("<body>Testing</body>", element.toString());
    }

    @Test
    public void selectXpathTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>Testing</body></html>");
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        W3CDom w3CDom = new W3CDom();
        NodeList nodes = w3CDom.selectXpath("//body", w3cDoc);
        assertNotNull(nodes);
    }

    @Test
    public void sourceNodesTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>Testing</body></html>");
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        W3CDom w3CDom = new W3CDom();
        NodeList nodes = w3CDom.selectXpath("//body", w3cDoc);
        assertNotNull(w3CDom.sourceNodes(nodes, Element.class));
    }

    @Test
    public void contextNodeTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>Testing</body></html>");
        W3CDom w3CDom = new W3CDom();
        Document w3cDoc = w3CDom.fromJsoup(jsoupDoc);
        Node contextNode = w3CDom.contextNode(w3cDoc);
        assertNotNull(contextNode);
    }

    @Test
    public void asStringTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>Testing</body></html>");
        Document w3cDoc = W3CDom.convert(jsoupDoc);
        String stringW3cDoc = new W3CDom().asString(w3cDoc);
        assertNotNull(stringW3cDoc);
    }

}