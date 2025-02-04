package org.jsoup.nodes;

public class GeneratedSplitText_SplitsTextNodeAtGivenOffset {

    @Test
    public void splitText_SplitsTextNodeAtGivenOffset() {
        // given
        TextNode textNode = new TextNode("Hello World");
        int offset = 5;

        // when
        TextNode result = textNode.splitText(offset);

        // then
        assertEquals(6, result.text().length());
    }

}