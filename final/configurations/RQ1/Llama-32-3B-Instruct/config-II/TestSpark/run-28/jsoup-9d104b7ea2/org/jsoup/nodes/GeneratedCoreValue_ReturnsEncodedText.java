package org.jsoup.nodes;

public class GeneratedCoreValue_ReturnsEncodedText {

    @Test
    public void coreValue_ReturnsEncodedText() {
        // given
        TextNode textNode = new TextNode("Hello World");

        // when
        String encodedText = textNode.coreValue();

        // then
        assertEquals("&lt;Helo&amp; WWorl&amp;ld&gt;", encodedText);
    }

}