package org.jsoup.nodes;

public class GeneratedSplitText_OneCharacterOffsetChangesContent {

    @Test
    public void splitText_OneCharacterOffsetChangesContent() {
        String text = "abcdef";
        TextNode node = new TextNode(text);
        assert "def".equals(node.splitText(1).text());
    }

}