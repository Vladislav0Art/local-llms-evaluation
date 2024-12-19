package org.jsoup.nodes;

public class GeneratedTestNoNewlines {

    @Test
    public void testNoNewlines() {
        TextNode textNode = new TextNode("HelloWorld");
        assertFalse(textNode.text().contains("\n"));
    }

}