package org.jsoup.nodes;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode textNode = new TextNode("some text");
        String text = textNode.text();
        assertEquals("some text", text);
    }

}