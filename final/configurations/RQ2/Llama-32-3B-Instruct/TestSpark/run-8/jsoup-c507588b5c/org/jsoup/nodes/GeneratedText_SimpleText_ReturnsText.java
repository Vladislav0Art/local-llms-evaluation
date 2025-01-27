package org.jsoup.nodes;

public class GeneratedText_SimpleText_ReturnsText {

    @Test
    public void text_SimpleText_ReturnsText() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

}