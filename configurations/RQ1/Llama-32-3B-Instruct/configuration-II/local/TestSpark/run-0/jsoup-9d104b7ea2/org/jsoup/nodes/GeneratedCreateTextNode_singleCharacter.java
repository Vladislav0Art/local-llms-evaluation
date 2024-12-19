package org.jsoup.nodes;

public class GeneratedCreateTextNode_singleCharacter {

    private TextNode textNode;

    @Test
    public void createTextNode_singleCharacter() {
        textNode = new TextNode("a");
        assertEquals("a", textNode.text());
    }

}