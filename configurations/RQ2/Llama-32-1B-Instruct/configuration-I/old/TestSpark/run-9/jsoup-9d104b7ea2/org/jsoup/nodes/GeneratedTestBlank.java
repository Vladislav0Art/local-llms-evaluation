package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

public class GeneratedTestBlank {

    public static String stripLeadingWhitespace(TextNode node) {
        if (node instanceof Element && ((Element) node).tagName().equals("P")) {
            return ((TextNode) ((Element) node).children()).trim();
        } else {
            return "";
        }
    }

    @Test
    public void testBlank() {
        TextNode node = new TextNode("");
        assertEquals("", stripLeadingWhitespace(node));
    }

}