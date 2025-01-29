package org.jsoup.nodes;

public class GeneratedTestTextNodeSplitText {

    @Test
    public void testTextNodeSplitText() {
        TextNode node = new TextNode("Hello ");
        String splitText = node.splitText(4);
        assertEquals("", splitText);
    }

}