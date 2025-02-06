package org.jsoup.nodes;

public class GeneratedSplitText_MiddleOffset {

    @Test
    public void splitText_MiddleOffset() {
        TextNode node = new TextNode("abcdefg");
        TextNode result1 = node.splitText(3);
        TextNode result2 = node.splitText(4);
        assertFalse(result1.equals(node));
        assertTrue(result2.equals(node));
    }

}