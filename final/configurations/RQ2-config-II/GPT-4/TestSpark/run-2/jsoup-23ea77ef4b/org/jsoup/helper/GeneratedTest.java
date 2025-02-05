package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareDefaultTest() {
        W3CDom w3CDom = new W3CDom();
        assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSetTrueTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(true);
        assertTrue(w3CDom.namespaceAware());
    }

    @Test
    public void namespaceAwareSetFalseTest() {
        W3CDom w3CDom = new W3CDom();
        w3CDom.namespaceAware(false);
        assertFalse(w3CDom.namespaceAware());
    }

    @Test
    public void propertiesFromMapTest() {
        HashMap<String, String> map = new HashMap<String, String>() {{
            put("format", "pretty");
            put("method", "html");
        }};
        java.util.Properties result = W3CDom.propertiesFromMap(map);
        assertEquals("pretty", result.get("format"));
        assertEquals("html", result.get("method"));
    }

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> properties = W3CDom.OutputHtml();
        assertEquals("pretty", properties.get("format"));
        assertEquals("html", properties.get("method"));
    }

    @Test
    public void outputXmlTest() {
        HashMap<String, String> properties = W3CDom.OutputXml();
        assertEquals("pretty", properties.get("format"));
        assertEquals("xml", properties.get("method"));
    }

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom w3CDom = new W3CDom();
        Document jsoupDoc = Mockito.mock(Document.class);
        assertNotNull(w3CDom.fromJsoup(jsoupDoc));
    }

    @Test
    public void fromJsoupElementTest() {
        W3CDom w3CDom = new W3CDom();
        Element jsoupElement = Mockito.mock(Element.class);
        assertNotNull(w3CDom.fromJsoup(jsoupElement));
    }

    @Test
    public void contextNodeTest() {
        W3CDom w3CDom = new W3CDom();
        Document wDoc = Mockito.mock(Document.class);
        assertNotNull(w3CDom.contextNode(wDoc));
    }

    @Test
    public void selectXpathExceptionTest() {
        W3CDom w3CDom = new W3CDom();
        Document wDoc = Mockito.mock(Document.class);
        w3CDom.selectXpath("InvalidXpath", wDoc);
    }

    @Test
    public void selectXpathContextNodeExceptionTest() {
        W3CDom w3CDom = new W3CDom();
        Node node = Mockito.mock(Node.class);
        w3CDom.selectXpath("InvalidXpath", node);
    }

}