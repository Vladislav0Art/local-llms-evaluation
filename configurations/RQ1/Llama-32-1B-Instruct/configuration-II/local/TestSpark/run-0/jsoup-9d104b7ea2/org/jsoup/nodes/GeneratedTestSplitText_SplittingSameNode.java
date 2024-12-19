package org.jsoup.nodes;

public class GeneratedTestSplitText_SplittingSameNode {

    @Test
    public void testSplitText_SplittingSameNode() {
        String text = "   hello   ";
        TextNode node = new TextNode(text);
        TextNode node2 = new TextNode(node.getText());
        assertEquals(node, TextNode.splitText(3));
    }

}