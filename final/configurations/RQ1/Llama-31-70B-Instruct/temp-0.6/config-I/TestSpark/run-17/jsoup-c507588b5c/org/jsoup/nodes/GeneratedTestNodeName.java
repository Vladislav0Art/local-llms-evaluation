package org.jsoup.nodes;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("text");
        assertEquals("#text", textNode.nodeName());
    }

}