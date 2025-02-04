package org.jsoup.nodes;

public class GeneratedGetWholeText_ReturnsUnencodedText {

    @Test
    public void getWholeText_ReturnsUnencodedText() {
        // given
        TextNode textNode = new TextNode("Hello\nWorld");

        // when
        String wholeText = textNode.getWholeText();

        // then
        assertEquals("Hello World", wholeText);
    }

}