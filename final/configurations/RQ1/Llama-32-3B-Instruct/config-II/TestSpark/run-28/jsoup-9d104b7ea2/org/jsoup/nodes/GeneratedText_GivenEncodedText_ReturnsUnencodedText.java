package org.jsoup.nodes;

public class GeneratedText_GivenEncodedText_ReturnsUnencodedText {

    @Test
    public void text_GivenEncodedText_ReturnsUnencodedText() {
        // given
        TextNode textNode = new TextNode(Entities.unescape("Hello &amp; World"));

        // when
        String text = textNode.text();

        // then
        assertEquals("Hello & World", text);
    }

}