package org.jsoup.nodes;

public class GeneratedText_WithWhitespace_ReturnsNormalizedString {

    @Test
    public void text_WithWhitespace_ReturnsNormalizedString() {
        String text = "   Hello   ";
        TextNode node = new TextNode(text);
        assertEquals(TextNode.normaliseWhitespace(text), node.text());
    }

}