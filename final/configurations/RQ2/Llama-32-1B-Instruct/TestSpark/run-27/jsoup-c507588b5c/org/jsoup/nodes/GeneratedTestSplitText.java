package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("HELLO", node.splitText(7));
    }

}