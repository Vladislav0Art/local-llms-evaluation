package org.jsoup.nodes;

public class GeneratedText_NoWhitespace_ReturnsOriginalString {

    @Test
    public void text_NoWhitespace_ReturnsOriginalString() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

}