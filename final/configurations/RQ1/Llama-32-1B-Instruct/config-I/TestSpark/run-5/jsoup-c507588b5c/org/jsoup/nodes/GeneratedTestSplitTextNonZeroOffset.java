package org.jsoup.nodes;

public class GeneratedTestSplitTextNonZeroOffset {

    @Test
    public void testSplitTextNonZeroOffset() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        TextNode tail = node.splitText(5);
        assertNotNull(tail);
    }

}