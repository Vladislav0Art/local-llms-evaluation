package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text);

        // then
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
    }

}