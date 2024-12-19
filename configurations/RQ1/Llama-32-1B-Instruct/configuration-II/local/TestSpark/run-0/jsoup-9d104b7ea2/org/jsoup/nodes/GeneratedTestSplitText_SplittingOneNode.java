package org.jsoup.nodes;

public class GeneratedTestSplitText_SplittingOneNode {

    @Test
    public void testSplitText_SplittingOneNode() {
        String text = "   hello   ";
        TextNode node1 = new TextNode(text.substring(0, 4));
        TextNode node2 = new TextNode(text.substring(5, 8));
        assertEquals(node1, TextNode.splitText(3));
    }

}