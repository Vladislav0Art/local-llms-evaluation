package org.jsoup.nodes;

public class GeneratedTestSplitText_DifferentOffsetDifferentNode {

    @Test
    public void testSplitText_DifferentOffsetDifferentNode() {
        String text = "   hello   \\n  world  \\\\n   ";
        TextNode node1 = new TextNode(text.substring(0, 4));
        TextNode node2 = new TextNode(text.substring(5, 8));
        assertEquals(node2, TextNode.splitText(3));
    }

}