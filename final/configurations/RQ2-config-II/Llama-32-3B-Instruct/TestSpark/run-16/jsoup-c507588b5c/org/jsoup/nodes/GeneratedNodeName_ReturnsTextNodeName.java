package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsTextNodeName {

    @Test
    public void nodeName_ReturnsTextNodeName() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.nodeName());
    }

}