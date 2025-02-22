package org.jsoup.nodes;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("test text");
        assertEquals("test text", textNode.text());
        textNode.text("new text");
        assertEquals("new text", textNode.text());
    }

}