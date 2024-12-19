package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedTest {

    public static String stripLeadingWhitespace(TextNode node) {
        if (node instanceof Element && ((Element) node).tagName().equals("P")) {
            return ((TextNode) ((Element) node).children()).trim();
        } else {
            return "";
        }
    }

}