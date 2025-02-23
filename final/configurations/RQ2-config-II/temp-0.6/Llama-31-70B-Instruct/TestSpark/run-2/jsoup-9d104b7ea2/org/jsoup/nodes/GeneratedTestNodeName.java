package org.jsoup.nodes;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("some text");
        assertEquals(textNode.nodeName(), "#text");
    }

}