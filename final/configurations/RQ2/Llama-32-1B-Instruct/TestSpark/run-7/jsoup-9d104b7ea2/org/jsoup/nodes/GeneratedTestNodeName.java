package org.jsoup.nodes;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("hello world", textNode.nodeName());
    }

}