package org.jsoup.nodes;

public class GeneratedText_NotEmptyTextNode ReturnsCorrectText {

    @Test
    public void text_NotEmptyTextNode

    ReturnsCorrectText() {
        TextNode textNode = new TextNode("Hello");
        assertEquals("Hello", textNode.text());
    }

}