package org.jsoup.nodes;

public class GeneratedToStringReturnsOuterHTML {

    @Test
    public void toStringReturnsOuterHTML() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals("<span> Hello World </span>", node.toString());
    }

}