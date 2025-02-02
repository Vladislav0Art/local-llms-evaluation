package org.jsoup.nodes;

public class GeneratedTestSplitTextOffSetZero {

    @Test
    public void testSplitTextOffSetZero() {
        String text = "Hello World!";
        TextNode node = new TextNode(text);
        TextNode tail = node.splitText(0);
        assertNotNull(tail);
    }

}