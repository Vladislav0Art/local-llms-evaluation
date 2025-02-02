package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNullText {

    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Test
    public void testNullText() {
        TextNode textNode = null;
        assertTrue(TextNode.isBlank());
    }

}