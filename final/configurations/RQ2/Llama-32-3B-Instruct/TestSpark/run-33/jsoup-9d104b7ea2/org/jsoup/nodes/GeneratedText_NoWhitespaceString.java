package org.jsoup.nodes;

public class GeneratedText_NoWhitespaceString {

    @Test
    public void text_NoWhitespaceString() {
        String text = "Hello";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}