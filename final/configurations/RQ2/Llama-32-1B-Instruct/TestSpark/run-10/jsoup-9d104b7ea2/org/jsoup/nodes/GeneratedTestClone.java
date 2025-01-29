package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello");
        TextNode clone = (TextNode) node1.clone();
        assertEquals(node1, clone);
    }

}