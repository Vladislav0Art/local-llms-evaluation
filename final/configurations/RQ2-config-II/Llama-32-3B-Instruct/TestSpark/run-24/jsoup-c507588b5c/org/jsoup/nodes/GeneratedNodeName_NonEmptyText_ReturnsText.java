package org.jsoup.nodes;

public class GeneratedNodeName_NonEmptyText_ReturnsText {

    @Test
    public void nodeName_NonEmptyText_ReturnsText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("Hello World", textNode.nodeName());
    }

}