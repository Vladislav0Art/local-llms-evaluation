package org.jsoup.nodes;

public class GeneratedNodeNameShouldReturnText {

    @Test
    public void nodeNameShouldReturnText() {
        TextNode node = new TextNode("");
        assertEquals("#text", node.nodeName());
    }

}