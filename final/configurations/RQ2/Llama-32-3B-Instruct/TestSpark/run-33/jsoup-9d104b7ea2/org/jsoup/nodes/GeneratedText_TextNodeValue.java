package org.jsoup.nodes;

public class GeneratedText_TextNodeValue {

    @Test
    public void text_TextNodeValue() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}