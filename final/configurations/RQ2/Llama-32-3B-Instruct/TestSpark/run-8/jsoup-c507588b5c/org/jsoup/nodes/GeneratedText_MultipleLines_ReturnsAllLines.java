package org.jsoup.nodes;

public class GeneratedText_MultipleLines_ReturnsAllLines {

    @Test
    public void text_MultipleLines_ReturnsAllLines() {
        TextNode node = new TextNode("Line 1\nLine 2");
        assertEquals("Line 1\nLine 2", node.text());
    }

}