package org.jsoup.nodes;

public class GeneratedText_ReturnsGivenText {

    @Test
    public void text_ReturnsGivenText() {
        String text = "test";
        TextNode node = new TextNode(text);
        assert text.equals(node.text());
    }

}