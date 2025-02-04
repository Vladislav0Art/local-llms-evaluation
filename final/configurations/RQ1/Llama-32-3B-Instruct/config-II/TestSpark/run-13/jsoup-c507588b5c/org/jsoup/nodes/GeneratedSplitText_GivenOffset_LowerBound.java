package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffset_LowerBound {

    @Test
    public void splitText_GivenOffset_LowerBound() {
        // given
        TextNode node = new TextNode("test");
        int offset = 0;

        // when
        TextNode tail = node.splitText(offset);

        // then
        assertEquals(0, offset);
        assertSame(node, tail.previousSibling());
    }

}