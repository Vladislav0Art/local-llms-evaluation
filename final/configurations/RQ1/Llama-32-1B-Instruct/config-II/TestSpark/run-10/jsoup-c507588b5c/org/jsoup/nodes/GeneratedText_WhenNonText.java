package org.jsoup.nodes;

public class GeneratedText_WhenNonText {

    @Test
    public void text_WhenNonText() {
        TextNode node = new TextNode(123);
        assertEquals("", node.text("   "));
    }

}