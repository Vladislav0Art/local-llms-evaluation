package org.jsoup.nodes;

public class GeneratedText_WhenNotBlank {

    @Test
    public void text_WhenNotBlank() {
        TextNode node = new TextNode("Hello");
        assertEquals(" Hello", node.text("   "));
    }

}