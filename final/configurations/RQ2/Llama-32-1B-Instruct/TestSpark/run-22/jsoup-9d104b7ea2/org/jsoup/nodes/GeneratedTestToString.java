package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("<TextNode><text> Hello ,  World </text></TextNode>", node.toString());
    }

}