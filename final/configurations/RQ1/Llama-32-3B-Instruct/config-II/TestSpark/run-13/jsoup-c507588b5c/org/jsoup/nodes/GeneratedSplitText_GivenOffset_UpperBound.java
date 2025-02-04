package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffset_UpperBound {

    @Test
    public void splitText_GivenOffset_UpperBound() {
        // given
        TextNode node = new TextNode("test");
        int offset = 5;

        // when
        TextNode tail = node.splitText(offset);

        // then
        assertEquals(5, offset);
        assertSame(node, tail.previousSibling());
    }

}