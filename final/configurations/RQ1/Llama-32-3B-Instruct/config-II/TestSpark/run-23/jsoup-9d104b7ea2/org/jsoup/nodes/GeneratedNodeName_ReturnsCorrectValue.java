package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectValue {

    @Test
    public void nodeName_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("Text");
        assertEquals("#text", textNode.nodeName());
    }

}