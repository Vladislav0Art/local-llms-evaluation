package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsBlank {

    public static Document createNode(String name, String[] attributes) {
        return new Document();
    }

    @Test
    public void testIsBlank() {
        assertTrue(isBlank("   Hello   "));
        assertTrue(isBlank("Hello World"));
        assertFalse(isBlank(""));
        assertFalse(isBlank(null));
    }

}