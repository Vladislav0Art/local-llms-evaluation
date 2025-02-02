package org.jsoup.nodes;

public class GeneratedText_GivenNonEmptyText_ReturnsCorrectText {

    @Test
    public void text_GivenNonEmptyText_ReturnsCorrectText() {
        String text = "test";
        TextNode node = new TextNode(text);
        assertEquals(text, StringUtil.normaliseWhitespace(node.text()));
    }

}