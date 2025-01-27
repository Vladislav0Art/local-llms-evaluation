package org.jsoup.nodes;

public class GeneratedNodeName_SimpleText_ReturnsText {

    @Test
    public void nodeName_SimpleText_ReturnsText() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.nodeName());
    }

}