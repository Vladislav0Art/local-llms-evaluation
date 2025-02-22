package org.jsoup.nodes;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("   Hello world!   ");
        assertEquals("Hello world!", textNode.text());
    }

}