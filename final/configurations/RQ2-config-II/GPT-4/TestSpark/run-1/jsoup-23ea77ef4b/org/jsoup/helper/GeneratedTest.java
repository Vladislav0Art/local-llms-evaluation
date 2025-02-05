package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void namespaceAwareTest() {
        W3CDom w3cDom = new W3CDom();
        assertFalse(w3cDom.namespaceAware());
        w3cDom.namespaceAware(true);
        assertTrue(w3cDom.namespaceAware());
    }

    @Test
    public void convertNullDocumentTest() {
        W3CDom.convert(null);
    }

    @Test
    public void fromJsoupNullDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.fromJsoup((org.jsoup.nodes.Document) null);
    }

    @Test
    public void fromJsoupNullElementTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.fromJsoup((org.jsoup.nodes.Element) null);
    }

    @Test
    public void convertNullInDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(null, null);
    }

    @Test
    public void convertNullInElementTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.convert(null, null);
    }

    @Test
    public void selectXpathEmptyExpressionTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.selectXpath("", null);
    }

    @Test
    public void selectXpathNullDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.selectXpath("//*", null);
    }

    @Test
    public void selectXpathNullContextNodeTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.selectXpath("//*", null);
    }

    @Test
    public void propertiesFromMapNullTest() {
        assertNull(W3CDom.propertiesFromMap(null));
    }

    @Test
    public void propertiesFromMapNotNullTest() {
        HashMap<String, String> properties = new HashMap<>();
        properties.put("key", "value");

        assertNotNull(W3CDom.propertiesFromMap(properties));
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
    public void sourceNodesNullNodeListTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.sourceNodes(null, Document.class);
    }

    @Test
    public void sourceNodesNullNodeTypeTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.sourceNodes(null, null);
    }

    @Test
    public void contextNodeNullDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        w3cDom.contextNode(null);
    }

    @Test
    public void asStringNullDocumentNullPropertiesTest() {
        assertNull(W3CDom.asString(null, null));
    }

}