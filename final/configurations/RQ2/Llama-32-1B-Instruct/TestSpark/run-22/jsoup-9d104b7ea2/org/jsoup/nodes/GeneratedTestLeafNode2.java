package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestLeafNode2 {

    public static String getText(Node node) {
        return node.getText().toString();
    }

    public static boolean isLeaf() {
        return getText(document).trim().isEmpty();
    }

    @Test
    public void testLeafNode2() {
        Document document = Jsoup.parse("<p>Hello ,  World </p>");
        LeafNode leaf2 = new LeafNode(document, "");
        assertTrue(leaf2.isLeaf());
        assertEquals("", leaf2.getText());

        assertTrue(leaf2.isLeaf());
        assertEquals("<script>alert('XSS')</script>", leaf2.getText());
    }

    public static void main(String[] args) {
        testLeafNode1();
        testLeafNode2();
    }

}