package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNodeHasChildElements {

    public static Document createMockDocument() {
        return new Document();
    }

    @Test
    public void testNodeHasChildElements() {
        Document document = createMockDocument();
        Element parent = newElement(document).parent();
        assertEquals(4, parent.children().size());
        assertTrue(parent.hasChildNodes());
    }

    private Element newElement(Document document) {
        return document.createElement("html").appendChild(newElement(document));
    }

}