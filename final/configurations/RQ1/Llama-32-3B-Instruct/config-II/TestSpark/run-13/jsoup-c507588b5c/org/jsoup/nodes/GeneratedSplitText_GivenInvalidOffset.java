package org.jsoup.nodes;

public class GeneratedSplitText_GivenInvalidOffset {

    @Test
    public void splitText_GivenInvalidOffset() {
        // given
        TextNode node = new TextNode("test");
        int offset = 10;

        // when
        node.splitText(offset);
    }

}