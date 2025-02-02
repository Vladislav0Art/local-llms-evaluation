package org.jsoup.nodes;

public class GeneratedTestCloneBlankTextNode {

    @Test
    public void testCloneBlankTextNode() {
        TextNode textNode = new TextNode("");
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertNotNull(clonedTextNode);
    }

}