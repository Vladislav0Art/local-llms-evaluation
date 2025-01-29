package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode node = new TextNode("Hello World");
        assertEquals("<p>Hello World</p>", node.toString());
    }

}