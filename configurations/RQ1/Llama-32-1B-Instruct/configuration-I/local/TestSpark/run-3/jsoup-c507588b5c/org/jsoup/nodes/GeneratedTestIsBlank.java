package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestIsBlank {

    public static Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testIsBlank() {
        assertTrue(createTextNode("a").blank());
        assertFalse(createTextNode(" a").blank(null));
    }

}