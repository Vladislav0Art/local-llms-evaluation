package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsBlank {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Test
    public void testIsBlank() {
        assertTrue(TextNode.isBlank());
    }

    public static public Document getDocument() {
        return new Document();
    }

}