package org.jsoup.nodes;

public class GeneratedCreateTextNode_emptyText {

    private TextNode textNode;

    @Test
    public void createTextNode_emptyText() {
        textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

}