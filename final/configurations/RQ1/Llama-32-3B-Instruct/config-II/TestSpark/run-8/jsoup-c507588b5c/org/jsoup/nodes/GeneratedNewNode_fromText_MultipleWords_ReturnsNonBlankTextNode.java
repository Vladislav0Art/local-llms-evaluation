package org.jsoup.nodes;

public class GeneratedNewNode_fromText_MultipleWords_ReturnsNonBlankTextNode {

    @Test
    public void newNode_fromText_MultipleWords_ReturnsNonBlankTextNode() {
        TextNode textNode = new TextNode("word1 word2");
        assertFalse(textNode.isBlank());
    }

}