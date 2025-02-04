package org.jsoup.nodes;

public class GeneratedText_ReturnsUnencodedText {

    @Test
    public void text_ReturnsUnencodedText() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        String text = textNode.text();

        // then
        assertEquals("Hello World", text);
    }

}