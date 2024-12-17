package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

public class GeneratedTestStripLeadingWhitespace {

    public static String stripLeadingWhitespace(TextNode node) {
        if (node instanceof Element && ((Element) node).tagName().equals("P")) {
            return ((TextNode) ((Element) node).children()).trim();
        } else {
            return "";
        }
    }

    @Test
    public void testStripLeadingWhitespace() {
        StringBuilder sb = new StringBuilder();
        sb.append("   <p>Hello, World!</p>");
        TextNode node = new TextNode(sb.toString());
        assertEquals("", stripLeadingWhitespace(node));
    }

}