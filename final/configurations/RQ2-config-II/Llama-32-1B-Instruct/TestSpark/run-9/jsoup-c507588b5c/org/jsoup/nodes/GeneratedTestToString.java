package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("<text>hello world</text>", node.toString());
    }

}