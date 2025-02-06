package org.jsoup.nodes;

public class GeneratedNodeNameShouldReturnTextNodeName {

    @Test
    public void nodeNameShouldReturnTextNodeName() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

}