package org.jsoup.nodes;

public class GeneratedTestTextNodeName {

    @Test
    public void testTextNodeName() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("text", node.nodeName());
    }

}