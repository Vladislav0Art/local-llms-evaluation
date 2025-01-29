package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNodeHasAttributes {

    public static Document createMockDocument() {
        return new Document();
    }

    @Test
    public void testNodeHasAttributes() {
        Document document = createMockDocument();
        Element node = newElement(document);
        assertEquals(4, node.attributes().size());
        assertTrue(node.hasAttr("attr1"));
        assertTrue(node.hasAttr("attr2"));
        assertFalse(node.hasAttr("attr3"));
    }

}