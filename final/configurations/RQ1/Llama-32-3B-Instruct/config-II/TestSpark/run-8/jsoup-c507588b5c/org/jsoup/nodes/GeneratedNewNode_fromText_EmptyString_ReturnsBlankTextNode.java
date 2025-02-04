package org.jsoup.nodes;

public class GeneratedNewNode_fromText_EmptyString_ReturnsBlankTextNode {

    @Test
    public void newNode_fromText_EmptyString_ReturnsBlankTextNode() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}