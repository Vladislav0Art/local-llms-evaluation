package org.jsoup.nodes;

public class GeneratedGetWholeTextReturnsUnencodedText {

    @Test
    public void getWholeTextReturnsUnencodedText() {
        // given
        TextNode textNode = new TextNode("<Hello> World");

        // when
        String wholeText = textNode.getWholeText();

        // then
        assertEquals("Hello World", wholeText);
    }

}