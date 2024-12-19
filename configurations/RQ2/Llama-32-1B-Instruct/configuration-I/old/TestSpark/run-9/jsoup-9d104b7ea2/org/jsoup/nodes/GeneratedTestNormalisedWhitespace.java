package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

public class GeneratedTestNormalisedWhitespace {

    public static String stripLeadingWhitespace(TextNode node) {
        if (node instanceof Element && ((Element) node).tagName().equals("P")) {
            return ((TextNode) ((Element) node).children()).trim();
        } else {
            return "";
        }
    }

    @Test
    public void testNormalisedWhitespace() {
        String text = "   <p>Hello, World!</p>";
        TextNode node = new TextNode(text);
        assertEquals("Hello, World!", stripLeadingWhitespace(node));
    }

}