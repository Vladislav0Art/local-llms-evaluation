package org.jsoup.nodes;

public class GeneratedText_SplittingCharacterChangesContent {

    @Test
    public void text_SplittingCharacterChangesContent() {
        String text = "abc\ndef";
        TextNode node = new TextNode(text);
        assert "def".equals(node.text());
    }

}