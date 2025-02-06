package org.jsoup.nodes;

public class GeneratedText_EmptyText_ReturnsEmptyString {

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}