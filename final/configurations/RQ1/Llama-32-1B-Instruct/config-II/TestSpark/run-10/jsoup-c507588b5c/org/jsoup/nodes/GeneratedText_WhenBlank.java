package org.jsoup.nodes;

public class GeneratedText_WhenBlank {

    @Test
    public void text_WhenBlank() {
        TextNode node = new TextNode("");
        assertEquals("", node.text(""));
    }

}