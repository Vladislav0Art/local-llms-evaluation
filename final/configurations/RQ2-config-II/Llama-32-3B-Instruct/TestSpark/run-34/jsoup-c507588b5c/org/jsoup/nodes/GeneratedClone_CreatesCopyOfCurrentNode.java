package org.jsoup.nodes;

public class GeneratedClone_CreatesCopyOfCurrentNode {

    @Test
    public void clone_CreatesCopyOfCurrentNode() {
        TextNode node = new TextNode("Hello");
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(node.text(), cloned.text());
    }

}