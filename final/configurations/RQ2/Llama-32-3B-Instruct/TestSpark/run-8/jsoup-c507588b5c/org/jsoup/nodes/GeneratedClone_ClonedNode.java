package org.jsoup.nodes;

public class GeneratedClone_ClonedNode {

    @Test
    public void clone_ClonedNode() {
        TextNode original = new TextNode("Hello");
        TextNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original.text(), cloned.text());
    }

}