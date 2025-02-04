package org.jsoup.nodes;

public class GeneratedNewNodeFromEmptyTextCreatesBlankTextNode {

    @Test
    public void newNodeFromEmptyTextCreatesBlankTextNode() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}