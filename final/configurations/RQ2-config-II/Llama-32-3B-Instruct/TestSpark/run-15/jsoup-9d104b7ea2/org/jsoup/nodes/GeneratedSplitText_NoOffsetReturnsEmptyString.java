package org.jsoup.nodes;

public class GeneratedSplitText_NoOffsetReturnsEmptyString {

    @Test
    public void splitText_NoOffsetReturnsEmptyString() {
        TextNode node = new TextNode("abc");
        assert "".equals(node.splitText(0).text());
    }

}