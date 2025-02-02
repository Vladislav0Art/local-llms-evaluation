package org.jsoup.nodes;

public class GeneratedText_GivenEmptyText_ReturnsEmptyString {

    @Test
    public void text_GivenEmptyText_ReturnsEmptyString() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

}