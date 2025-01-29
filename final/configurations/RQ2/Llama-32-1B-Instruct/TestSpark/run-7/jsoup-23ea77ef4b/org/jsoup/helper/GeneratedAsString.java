package org.jsoup.helper;

import org.jsoup.parser.Parser;

import static org.jsoup.select.Selector.*;
import static org.jsoup.nodes.Node.Element;
import static org.jsoup.nodes.Node.NodeType.TEXT_NODE;
import static org.jsoup.nodes.Node.NodeType.ATTRIBUTE_NODE;
import static org.jsoup.nodes.Node.NodeType.ELEMENT_NODE;

public class GeneratedAsString {

    public Document parse(String html) {
        return Parser.parse(html).getDocument();
    }

    public Element fromJsoup(Element el) {
        if (el instanceof AttributeNode) {
            String attr = ((AttributeNode) el).name().toLowerCase();
            return new W3CDom().convert(el, attr);
        } else {
            return createNode("html", "body", ((Element) el).tagName());
        }
    }

    @Test
    public void asString() {
        Document doc = parse("<html><body>Hello <span>world!</span></body></html>");
        String result = doc.asString();
        assertNotNull(result);
        assertTrue("Attribute", result.startsWith("<!DOCTYPE html>"));
    }

}