package org.jsoup.nodes;

public class GeneratedTextReturnsUnencodedText {

    @Test
    public void textReturnsUnencodedText() {
        // given
        TextNode textNode = new TextNode("<Hello> World");

        // when
        String text = textNode.text();

        // then
        assertEquals("Hello World", text);
    }

}