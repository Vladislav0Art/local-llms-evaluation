package org.jsoup.nodes;

public class GeneratedNodeNameReturnsCorrectValue {

    private TextNode textNode;

    @Test
    public void nodeNameReturnsCorrectValue() {
        textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

}