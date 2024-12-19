package org.jsoup.nodes;

public class GeneratedCreateTextNode_newline {

    private TextNode textNode;

    @Test
    public void createTextNode_newline() {
        textNode = new TextNode("\n");
        assertEquals("\n", textNode.text());
    }

}