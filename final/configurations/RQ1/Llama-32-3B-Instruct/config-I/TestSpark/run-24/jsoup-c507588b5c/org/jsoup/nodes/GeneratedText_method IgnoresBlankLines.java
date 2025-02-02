package org.jsoup.nodes;

public class GeneratedText_method IgnoresBlankLines {

    @Test
    public void text_method

    IgnoresBlankLines() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.text());
    }

}