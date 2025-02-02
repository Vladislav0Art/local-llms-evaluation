package org.jsoup.nodes;

public class GeneratedNewNode createsNewTextNode {

    @Test
    public void newNode

    createsNewTextNode() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertEquals(text, node.text());
    }

}