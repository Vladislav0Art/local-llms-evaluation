package org.jsoup.nodes;

public class GeneratedSplitText_GivenOffsetThrowOutOfBoundsException {

    @Test
    public void splitText_GivenOffsetThrowOutOfBoundsException() {
        // given
        TextNode textNode = new TextNode("Hello World");
        int offset = 11;

        // when and then
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }

}