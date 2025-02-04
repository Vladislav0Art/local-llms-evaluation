package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffsetReturnsCorrectTextNode {

    @Test
    public void splitText_GivenOffsetReturnsCorrectTextNode() throws IOException {
        // given
        TextNode textNode = new TextNode("Hello World");
        int offset = 6;

        // when
        TextNode tailNode = textNode.splitText(offset);

        // then
        assertEquals(8, tailNode.text().length());
    }

}