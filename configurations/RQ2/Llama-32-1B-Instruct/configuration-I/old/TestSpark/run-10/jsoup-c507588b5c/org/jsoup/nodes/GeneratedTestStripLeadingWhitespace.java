package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestStripLeadingWhitespace {

    public static Document createNode(String name, String[] attributes) {
        Document node = new Document();
        addAttribute(node, name, attributes[0]);
        for (int i = 1; i < attributes.length; i++) {
            addAttribute(node, name + "=\"" + attributes[i] + "\"", attributes[i]);
        }
        return node;
    }

    private static void addAttribute(Document node, String name, String value) {
        Element element = node.createElement(name);
        element.attr("value", value);
        if (node.getElementsByTagName(name).length > 0) {
            element.appendChild(node.querySelector(name));
        } else {
            node.appendChild(element);
        }
    }

    public static boolean isBlank(String text) {
        return text.trim().isEmpty();
    }

    @Test
    public void testStripLeadingWhitespace() {
        Document doc = createNode("div", new String[]{"class", "test"});
        Element element = (Element) doc.getElementById("test");
        String result1 = TextNode.stripLeadingWhitespace(element.toString());
        assertEquals("", result1);
    }

}