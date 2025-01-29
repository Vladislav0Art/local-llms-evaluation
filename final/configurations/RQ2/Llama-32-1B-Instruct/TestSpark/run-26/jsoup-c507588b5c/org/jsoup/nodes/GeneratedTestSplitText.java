package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello World");
        assertEquals(5, node.splitText(0));
        assertEquals("Hello", node.splitText(1));
        assertEquals("", node.splitText(2));
        assertEquals("World", node.splitText(3));
        assertEquals("", node.splitText(4));
    }

}