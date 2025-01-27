package org.jsoup.nodes;

public class GeneratedCloneReturnsSameTextNode {

    @Test
    public void cloneReturnsSameTextNode() {
        TextNode textNode = new TextNode("Hello");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode, clonedTextNode);
    }

}