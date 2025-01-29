package org.jsoup.nodes;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("HELLO WORLD!", node.text());
    }

}