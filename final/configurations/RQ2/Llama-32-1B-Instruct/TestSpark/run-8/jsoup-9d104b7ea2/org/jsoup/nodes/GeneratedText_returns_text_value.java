package org.jsoup.nodes;

public class GeneratedText_returns_text_value {

    @Test
    public void text_returns_text_value() {
        TextNode node = new TextNode("Hello World");
        String expected = "Hello World";
        assertEquals(expected, node.text());
        assertEquals(expected, node.text(""));
    }

}