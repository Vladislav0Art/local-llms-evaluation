package org.jsoup.nodes;

public class GeneratedText_NoTextReturnsEmptyString {

    @Test
    public void text_NoTextReturnsEmptyString() {
        TextNode node = new TextNode("");
        assert "".equals(node.text());
    }

}