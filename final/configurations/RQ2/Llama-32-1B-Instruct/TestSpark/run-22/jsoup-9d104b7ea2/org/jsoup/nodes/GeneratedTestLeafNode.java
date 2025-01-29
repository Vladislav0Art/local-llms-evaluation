package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestLeafNode {

    public static String getText(Node node) {
        return node.getText().toString();
    }

    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError(condition);
        }
    }

    @Test
    public void testLeafNode() {
        Document document = Jsoup.parse("<p>Hello, World!</p>");
        LeafNode leaf1 = new LeafNode(document, "Hello, World!");
        LeafNode leaf2 = new LeafNode(document, "");
        LeafNode leaf3 = new LeafNode(document, "<script>alert('XSS')</script>");

        assertTrue(leaf1.isLeaf());
        assertEquals("", leaf1.getText());

        assertTrue(leaf2.isLeaf() && leaf2.getText().equals("Universe has no meaning."));

        assertTrue(leaf3.isLeaf());
        assertEquals("<p>Hello ,  World </p>", leaf3.getText());
    }

    public static void main(String[] args) {
        testLeafNode();
    }

}