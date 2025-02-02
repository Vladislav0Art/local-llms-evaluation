package org.jsoup.nodes;

public class GeneratedNodeName_ReturnsCorrectName {

    @Test
    public void nodeName_ReturnsCorrectName() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
    }

}