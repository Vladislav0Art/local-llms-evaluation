package org.jsoup.nodes;

public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.text());
    }

}