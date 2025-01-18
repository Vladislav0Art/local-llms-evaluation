package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    private W3CDom w3CDom = new W3CDom();

    @Test
    public void namespaceAwareTest() {
        boolean testValue = w3CDom.namespaceAware();
        Assert.assertTrue("Expected default value to be false", !testValue);
    }

    @Test
    public void namespaceAwareWithParameterTest() {
        w3CDom.namespaceAware(true);
        boolean testValue = w3CDom.namespaceAware();
        Assert.assertTrue("Expected value to be true", testValue);
    }

    @Test
    public void convertDocumentNullTest() {
        W3CDom.convert(null);
    }

    @Test
    public void convertDocumentTest() {
        Document documentMock = Mockito.mock(Document.class);
        W3CDom.convert(documentMock);
    }

    @Test
    public void asStringNullTest() {
        W3CDom.asString(null, null);
    }

    @Test
    public void asStringEmptyPropertyMapTest() {
        org.w3c.dom.Document docMock = Mockito.mock(org.w3c.dom.Document.class);
        Assert.assertNotNull(W3CDom.asString(docMock, new HashMap<>()));
    }

    @Test
    public void propertiesFromMapNullTest() {
        W3CDom.propertiesFromMap(null);
    }

    @Test
    public void propertiesFromMapEmptyTest() {
        Assert.assertTrue("Expected empty properties", W3CDom.propertiesFromMap(new HashMap<>()).isEmpty());
    }

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> hashMap = W3CDom.OutputHtml();
        Assert.assertFalse("HashMap should not be empty", hashMap.isEmpty());
    }

    @Test
    public void OutputXmlTest() {
        HashMap<String, String> hashMap = W3CDom.OutputXml();
        Assert.assertFalse("HashMap should not be empty", hashMap.isEmpty());
    }

    @Test
    public void fromJsoupDocumentNullTest() {
        w3CDom.fromJsoup((Document) null);
    }

    @Test
    public void fromJsoupDocumentTest() {
        Document documentMock = Mockito.mock(Document.class);
        w3CDom.fromJsoup(documentMock);
    }

    @Test
    public void fromJsoupElementNullTest() {
        w3CDom.fromJsoup((Element) null);
    }

    @Test
    public void fromJsoupElementTest() {
        Element elementMock = Mockito.mock(Element.class);
        w3CDom.fromJsoup(elementMock);
    }

    @Test
    public void convertDocumentNullTest() {
        w3CDom.convert(null, null);
    }

    @Test
    public void convertElementNullTest() {
        w3CDom.convert(null, null);
    }

    @Test
    public void selectXpathDocumentNullTest() {
        w3CDom.selectXpath(null, null);
    }

    @Test
    public void selectXpathNodeNullTest() {
        w3CDom.selectXpath(null, null);
    }

    @Test
    public void sourceNodesNullTest() {
        w3CDom.sourceNodes(null, null);
    }

    @Test
    public void sourceNodesTest() {
        NodeList nodeListMock = Mockito.mock(NodeList.class);
        w3CDom.sourceNodes(nodeListMock, Document.class);
    }

    @Test
    public void contextNodeNullTest() {
        w3CDom.contextNode(null);
    }

    @Test
    public void contextNodeTest() {
        org.w3c.dom.Document wDocMock = Mockito.mock(org.w3c.dom.Document.class);
        w3CDom.contextNode(wDocMock);
    }

    @Test
    public void asStringNullTest() {
        w3CDom.asString(null);
    }

    @Test
    public void asStringTest() {
        org.w3c.dom.Document wDocMock = Mockito.mock(org.w3c.dom.Document.class);
        w3CDom.asString(wDocMock);
    }

}