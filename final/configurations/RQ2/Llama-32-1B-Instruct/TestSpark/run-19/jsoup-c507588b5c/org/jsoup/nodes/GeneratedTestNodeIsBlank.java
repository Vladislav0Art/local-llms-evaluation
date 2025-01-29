package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNodeIsBlank {

    public static Document createMockDocument() {
        return new Document();
    }

    @Test
    public void testNodeIsBlank() {
        Document document = createMockDocument();
        Element node = newElement(document);
        assertTrue(node.isBlank());
    }

}