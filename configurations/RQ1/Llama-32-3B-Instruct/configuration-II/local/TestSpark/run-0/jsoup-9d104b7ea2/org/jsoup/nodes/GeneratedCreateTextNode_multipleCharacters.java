package org.jsoup.nodes;

public class GeneratedCreateTextNode_multipleCharacters {

    private TextNode textNode;

    @Test
    public void createTextNode_multipleCharacters() {
        textNode = new TextNode("abc");
        assertEquals("abc", textNode.text());
    }

}