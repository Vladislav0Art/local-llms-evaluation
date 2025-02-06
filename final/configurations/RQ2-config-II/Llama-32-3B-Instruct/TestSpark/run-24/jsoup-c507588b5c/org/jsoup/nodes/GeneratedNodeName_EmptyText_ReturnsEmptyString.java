package org.jsoup.nodes;

public class GeneratedNodeName_EmptyText_ReturnsEmptyString {

    @Test
    public void nodeName_EmptyText_ReturnsEmptyString() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.nodeName());
    }

}