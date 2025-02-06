package org.jsoup.nodes;

public class GeneratedClone_ReturnsSameObjectWhenNodeIsEmpty {

    @Test
    public void clone_ReturnsSameObjectWhenNodeIsEmpty() {
        TextNode textNode = new TextNode("");
        TextNode cloned = (TextNode) textNode.clone();
        assertSame(cloned, textNode);
    }

}