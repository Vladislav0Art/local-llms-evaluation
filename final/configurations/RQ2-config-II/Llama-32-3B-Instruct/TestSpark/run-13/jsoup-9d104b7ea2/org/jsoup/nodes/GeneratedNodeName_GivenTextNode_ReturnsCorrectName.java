package org.jsoup.nodes;

public class GeneratedNodeName_GivenTextNode_ReturnsCorrectName {

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectName() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.nodeName());
    }

}