package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestLeafNode1 {

    public static String getText(Node node) {
        return node.getText().toString();
    }

    public static boolean isLeaf() {
        return getText(document).trim().isEmpty();
    }

    @Test
    public void testLeafNode1() {
        Document document = Jsoup.parse("<p>Hello, World!</p>");
        LeafNode leaf1 = new LeafNode(document, "Hello, World!");
        assertTrue(isLeaf());
        assertEquals("", leaf1.getText());

        assertTrue(isLeaf());
        assertEquals("Universe has no meaning.", leaf1.getText());
    }

}