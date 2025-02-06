package org.jsoup.nodes;

public class GeneratedClone_GivenTextNode_ReturnsCorrectTextNode {

    @Test
    public void clone_GivenTextNode_ReturnsCorrectTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode.text());
    }

}