package org.jsoup.nodes;

public class GeneratedNodeNameReturnsCorrectValue {

    @Test
    public void nodeNameReturnsCorrectValue() {
        String text = "text-node";
        TextNode textNode = new TextNode(text);
        assertEquals("text-node", textNode.nodeName());
    }

}