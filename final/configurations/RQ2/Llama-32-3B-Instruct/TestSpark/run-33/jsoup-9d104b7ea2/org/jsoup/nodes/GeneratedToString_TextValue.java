package org.jsoup.nodes;

public class GeneratedToString_TextValue {

    @Test
    public void toString_TextValue() {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("<p>Hello, World!</p>", node.toString());
    }

}