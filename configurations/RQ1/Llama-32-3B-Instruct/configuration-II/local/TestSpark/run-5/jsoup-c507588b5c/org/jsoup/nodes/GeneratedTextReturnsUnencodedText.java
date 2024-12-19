package org.jsoup.nodes;

public class GeneratedTextReturnsUnencodedText {

    @Test
    public void textReturnsUnencodedText() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

}