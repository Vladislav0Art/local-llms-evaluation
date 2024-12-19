package org.jsoup.nodes;

public class GeneratedTestSplitText_DifferentOffset {

    @Test
    public void testSplitText_DifferentOffset() {
        String text = "   hello   \\n  world  \\\\n   ";
        TextNode node1 = new TextNode(text.substring(0, 4));
        TextNode node2 = new TextNode(text.substring(5, 8));
        TextNode node3 = new TextNode(text.substring(11, 14));
        assertEquals(node1, TextNode.splitText(3));
    }

}