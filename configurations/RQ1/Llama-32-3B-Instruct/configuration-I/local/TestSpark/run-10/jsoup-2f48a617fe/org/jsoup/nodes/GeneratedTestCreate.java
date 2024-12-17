package org.jsoup.nodes;

public class GeneratedTestCreate {

    @Test
    public void testCreate() {
        LeafNode leaf = new LeafNode("name", "value");
        assertEquals("name", leaf.getName());
        assertEquals("value", leaf.getValue());
    }

}