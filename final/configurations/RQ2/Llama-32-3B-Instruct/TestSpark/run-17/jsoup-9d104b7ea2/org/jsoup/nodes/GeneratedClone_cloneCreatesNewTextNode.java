package org.jsoup.nodes;

public class GeneratedClone_cloneCreatesNewTextNode {

    @Test
    public void clone_cloneCreatesNewTextNode() {
        TextNode textNode = new TextNode("test");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode.text(), clonedTextNode.text());
    }

}