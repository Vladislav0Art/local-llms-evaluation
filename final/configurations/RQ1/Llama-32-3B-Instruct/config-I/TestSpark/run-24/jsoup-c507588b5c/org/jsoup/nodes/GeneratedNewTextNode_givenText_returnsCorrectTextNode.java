package org.jsoup.nodes;

public class GeneratedNewTextNode_givenText_returnsCorrectTextNode {

    @Test
    public void newTextNode_givenText_returnsCorrectTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.nodeName());
        assertEquals("Hello World", textNode.text());
    }

}