package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenValidString_ReturnsTextNode {

    @Test
    public void createTextNode_GivenValidString_ReturnsTextNode() {
        // given
        String text = "Hello World";

        // when
        TextNode textNode = new TextNode(text);

        // then
        assertEquals("#text", textNode.nodeName());
        assertNotEquals("", textNode.text());
    }

}