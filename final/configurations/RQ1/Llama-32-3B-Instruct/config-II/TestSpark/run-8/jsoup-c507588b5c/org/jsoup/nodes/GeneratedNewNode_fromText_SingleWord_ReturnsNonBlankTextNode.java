package org.jsoup.nodes;

public class GeneratedNewNode_fromText_SingleWord_ReturnsNonBlankTextNode {

    @Test
    public void newNode_fromText_SingleWord_ReturnsNonBlankTextNode() {
        TextNode textNode = new TextNode("word");
        assertFalse(textNode.isBlank());
    }

}