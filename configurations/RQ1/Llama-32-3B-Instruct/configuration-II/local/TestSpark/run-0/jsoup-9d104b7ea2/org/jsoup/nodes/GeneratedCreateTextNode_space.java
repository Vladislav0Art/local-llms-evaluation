package org.jsoup.nodes;

public class GeneratedCreateTextNode_space {

    private TextNode textNode;

    @Test
    public void createTextNode_space() {
        textNode = new TextNode(" ");
        assertEquals(" ", textNode.text());
    }

}