package org.jsoup.nodes;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}