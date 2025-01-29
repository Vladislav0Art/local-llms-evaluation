package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNodeToString {

    public static Document createMockDocument() {
        return new Document();
    }

    @Test
    public void testNodeToString() {
        Document document = createMockDocument();
        Element node = newElement(document);
        String result = (String) node.toString();
        assertEquals("Hello, World!", result);
    }

}