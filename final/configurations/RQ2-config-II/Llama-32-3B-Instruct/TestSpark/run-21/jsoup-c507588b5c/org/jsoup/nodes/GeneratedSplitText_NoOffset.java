package org.jsoup.nodes;

public class GeneratedSplitText_NoOffset {

    @Test
    public void splitText_NoOffset() {
        TextNode node = new TextNode("abcdefg");
        TextNode result = node.splitText(0);
        assertEquals(node, result);
    }

}