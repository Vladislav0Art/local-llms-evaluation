package org.jsoup.nodes;

public class GeneratedNewNodeText_test {

    @Test
    public void newNodeText_test() {
        TextNode node = new TextNode("Hello");
        assertEquals("Hello", node.text());
    }

}