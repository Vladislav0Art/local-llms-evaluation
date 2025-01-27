package org.jsoup.nodes;

public class GeneratedSplitText_NoSplit_ReturnsOriginalNode {

    @Test
    public void splitText_NoSplit_ReturnsOriginalNode() {
        TextNode node = new TextNode("Hello");
        assertEquals(node, node.splitText(10));
    }

}