package org.jsoup.nodes;

public class GeneratedClone_ReturnsNewTextNodeWhenNodeIsNotEmpty {

    @Test
    public void clone_ReturnsNewTextNodeWhenNodeIsNotEmpty() {
        TextNode textNode = new TextNode("Hello");
        TextNode cloned = (TextNode) textNode.clone();
        assertNotNull(cloned);
        assertNotSame(textNode, cloned);
    }

}