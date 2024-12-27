package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;

public class GeneratedTest {

    private static final Document document = new Document();
    private static final Element element = new Element();

    public static class MockDocument extends Document {
        @Override
        public boolean namespaceAware() {
            return true;
        }
    }

    public static class W3CDomImpl {
        public static boolean namespaceAware(Document document) {
            return document.namespaceAware();
        }

        public static Document fromJsoup(MockDocument mockDocument) {
            return mockDocument;
        }

        public static Element fromJsoup(Element element) {
            return element;
        }

        public static String asString(Document document, Map<String, String> properties) {
            // implementation
            return "";
        }

        public static NodeList selectXpath(String xpath, Document document) {
            // implementation
            return null;
        }

        public static Node contextNode(Document document) {
            // implementation
            return null;
        }

        public static void w3cdom(Document documentIn, Document documentOut) {
            // implementation
        }
    }

    @Test
    public void namespaceAware_ReturnsTrue() {
        MockDocument mockDocument = new MockDocument();
        when(mockDocument.namespaceAware()).thenReturn(true);
        assertTrue(W3CDomImpl(namespaceAware(mockDocument)));
    }

    @Test
    public void namespaceAware_ReturnsFalseWhenArgumentIsFalse() {
        MockDocument mockDocument = new MockDocument();
        when(mockDocument.namespaceAware()).thenReturn(false);
        assertFalse(W3CDomImpl(namespaceAware(mockDocument)));
    }

    @Test
    public void fromJsoup_DocumentReturnsDocument() {
        W3CDomImpl.fromJsoup(document, null);
    }

    @Test
    public void fromJsoup_ElementReturnsElement() {
        W3CDomImpl.fromJsoup(element, null);
    }

    @Test
    public void asString_ReturnsStringWhenDocumentHasNoProperties() {
        String result = W3CDomImpl.asString(document, null);
        assertNotNull(result);
    }

    @Test
    public void asString_ReturnsStringWhenDocumentHasProperties() {
        Map<String, String> properties = new HashMap<>();
        properties.put("prop1", "value1");
        String result = W3CDomImpl.asString(document, properties);
        assertNotNull(result);
    }

    @Test
    public void selectXpath_ReturnsNodeListWhenDocumentHasNodes() {
        Document document = new Document();
        NodeList nodeList = W3CDomImpl.selectXpath("xpath", document);
        assertNotNull(nodeList);
    }

    @Test
    public void contextNode_ReturnsContextNodeWhenDocumentIsDocument() {
        Document document = new Document();
        Node result = W3CDomImpl.contextNode(document);
        assertNotNull(result);
    }

    @Test
    public void convert_ConvertsDocumentFromJsoupToW3cDom() {
        Document documentIn = new Document();
        Document documentOut = new Document();
        W3CDomImpl.w3cdom(documentIn, documentOut);
        assertEquals(documentIn, documentOut);
    }

    @Test
    public void convertConvertsElementFromJsoupToW3cDom() {
        Element elementIn = new Element();
        Document documentOut = new Document();
        W3CDomImpl.w3cdom(elementIn, documentOut);
        assertEquals(elementIn, documentOut);
    }

}