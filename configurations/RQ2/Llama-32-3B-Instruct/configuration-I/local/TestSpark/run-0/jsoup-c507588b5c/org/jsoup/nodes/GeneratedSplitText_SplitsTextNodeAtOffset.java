package org.jsoup.nodes;

public class GeneratedSplitText_SplitsTextNodeAtOffset {

    @Test
    public void splitText_SplitsTextNodeAtOffset() {
        // given
        TextNode textNode = new TextNode("Hello World");
        int offset = 6;

        // when
        TextNode splitTextNode = textNode.splitText(offset);

        // then
        assertEquals(6, splitTextNode.text().length());
    }

}