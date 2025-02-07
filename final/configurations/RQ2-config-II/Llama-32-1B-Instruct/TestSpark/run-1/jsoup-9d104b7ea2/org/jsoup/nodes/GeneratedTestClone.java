package org.jsoup.nodes;

public class GeneratedTestClone {

    private TextNode node;
    private Document document;

    @Test
    public void testClone() {
        TextNode cloned = (TextNode) node.clone();
        assertEquals(node, cloned);
    }

}