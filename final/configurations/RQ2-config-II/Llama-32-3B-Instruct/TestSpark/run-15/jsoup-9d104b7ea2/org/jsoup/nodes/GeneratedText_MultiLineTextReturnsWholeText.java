package org.jsoup.nodes;

public class GeneratedText_MultiLineTextReturnsWholeText {

    @Test
    public void text_MultiLineTextReturnsWholeText() {
        String text = "test\nanother test";
        TextNode node = new TextNode(text);
        assert text.equals(node.text());
    }

}