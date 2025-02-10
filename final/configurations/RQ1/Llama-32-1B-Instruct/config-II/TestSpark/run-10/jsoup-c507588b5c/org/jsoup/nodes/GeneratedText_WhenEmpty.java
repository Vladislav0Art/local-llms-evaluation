package org.jsoup.nodes;

public class GeneratedText_WhenEmpty {

    @Test
    public void text_WhenEmpty() {
        TextNode node = new TextNode("");
        assertEquals("", node.text("   "));
    }

}