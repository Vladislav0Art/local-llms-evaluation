package org.jsoup.nodes;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.nodeName());
    }

}