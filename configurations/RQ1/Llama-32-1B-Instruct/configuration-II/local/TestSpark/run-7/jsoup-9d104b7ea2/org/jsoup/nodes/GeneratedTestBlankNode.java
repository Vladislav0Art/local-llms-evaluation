package org.jsoup.nodes;

public class GeneratedTestBlankNode {

    @Test
    public void testBlankNode() {
        TextNode node = new TextNode("   ");
        assertNotNull(node);
        assertTrue(node.isBlank());
    }

}