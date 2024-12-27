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

public class GeneratedContextNode_ReturnsContextNodeWhenDocumentIsDocument {

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
    public void contextNode_ReturnsContextNodeWhenDocumentIsDocument() {
        Document document = new Document();
        Node result = W3CDomImpl.contextNode(document);
        assertNotNull(result);
    }

}