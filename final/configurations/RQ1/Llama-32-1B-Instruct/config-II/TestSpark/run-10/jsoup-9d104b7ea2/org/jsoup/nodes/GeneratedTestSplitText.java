package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "hello world";
        TextNode node = new TextNode(text);
        TextNode result1 = node.splitText(0);
        TextNode result2 = node.splitText(7);

        assertEquals("hello", result1.text());
        assertEquals("world", result2.text());
    }

}