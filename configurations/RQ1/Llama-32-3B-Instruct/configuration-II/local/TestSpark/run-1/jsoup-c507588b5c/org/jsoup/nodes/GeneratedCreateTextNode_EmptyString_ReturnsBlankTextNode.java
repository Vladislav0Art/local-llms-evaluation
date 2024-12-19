package org.jsoup.nodes;

public class GeneratedCreateTextNode_EmptyString_ReturnsBlankTextNode {

    @Test
    public void createTextNode_EmptyString_ReturnsBlankTextNode() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}