package org.jsoup.nodes;

public class GeneratedTextMethodReturnsCorrectTextForNonBlankNode {

    @Test
    public void textMethodReturnsCorrectTextForNonBlankNode() {
        TextNode node = new TextNode("test");
        assertEquals("test", node.text());
    }

}