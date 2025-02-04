package org.jsoup.nodes;

public class GeneratedSetTextNode_GivenText_ReturnsTextNode {

    @Test
    public void setTextNode_GivenText_ReturnsTextNode() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text).text(text);

        // then
        assertNotNull(textNode);
    }

}