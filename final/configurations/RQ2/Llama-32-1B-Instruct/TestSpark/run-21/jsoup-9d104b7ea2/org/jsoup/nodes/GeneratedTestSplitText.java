package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello World");
        assertEquals("", node.splitText(0));
        assertEquals("Hello", node.splitText(2));
    }

}