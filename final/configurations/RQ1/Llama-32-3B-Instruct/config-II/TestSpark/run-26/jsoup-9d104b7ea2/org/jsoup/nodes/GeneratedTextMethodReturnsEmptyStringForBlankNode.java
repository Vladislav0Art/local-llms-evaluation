package org.jsoup.nodes;

public class GeneratedTextMethodReturnsEmptyStringForBlankNode {

    @Test
    public void textMethodReturnsEmptyStringForBlankNode() {
        TextNode node = new TextNode("");
        assertEquals("", node.text());
    }

}