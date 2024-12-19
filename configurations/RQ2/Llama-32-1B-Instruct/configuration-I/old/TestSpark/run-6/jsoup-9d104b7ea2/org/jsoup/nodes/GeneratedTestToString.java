package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode text = new TextNode("Hello World");
        assertEquals("<p>Hello World</p>", text.toString());
    }

}