package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

public class GeneratedTestNoTextContent {

    public static String stripLeadingWhitespace(TextNode node) {
        if (node instanceof Element && ((Element) node).tagName().equals("P")) {
            return ((TextNode) ((Element) node).children()).trim();
        } else {
            return "";
        }
    }

    @Test
    public void testNoTextContent() {
        TextNode node = new TextNode("<p>Hello, World!</p>");
        assertTrue(stripLeadingWhitespace(node).trim().isEmpty());
    }

}