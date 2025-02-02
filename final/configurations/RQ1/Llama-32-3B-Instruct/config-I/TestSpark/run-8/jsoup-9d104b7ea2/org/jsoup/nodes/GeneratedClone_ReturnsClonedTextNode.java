package org.jsoup.nodes;

public class GeneratedClone_ReturnsClonedTextNode {

    @Test
    public void clone_ReturnsClonedTextNode() {
        TextNode originalTextNode = new TextNode("clone me");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(originalTextNode, clonedTextNode);
    }

}