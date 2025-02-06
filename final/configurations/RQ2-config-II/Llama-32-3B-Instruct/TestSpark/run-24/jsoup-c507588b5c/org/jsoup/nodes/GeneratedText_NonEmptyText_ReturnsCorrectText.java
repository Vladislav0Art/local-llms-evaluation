package org.jsoup.nodes;

public class GeneratedText_NonEmptyText_ReturnsCorrectText {

    @Test
    public void text_NonEmptyText_ReturnsCorrectText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}