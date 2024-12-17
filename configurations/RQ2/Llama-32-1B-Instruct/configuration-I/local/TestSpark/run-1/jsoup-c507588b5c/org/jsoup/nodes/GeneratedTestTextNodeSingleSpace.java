package org.jsoup.nodes;

public class GeneratedTestTextNodeSingleSpace {

    @Test
    public void testTextNodeSingleSpace() {
        TextNode node = new TextNode("   Hello ");
        assertTrue(node.isBlank());
    }

}