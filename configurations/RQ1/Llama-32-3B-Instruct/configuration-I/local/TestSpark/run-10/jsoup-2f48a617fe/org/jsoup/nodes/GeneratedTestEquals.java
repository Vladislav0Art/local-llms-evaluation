package org.jsoup.nodes;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        LeafNode leaf1 = new LeafNode("leaf1", "value");
        LeafNode leaf2 = new LeafNode("leaf1", "value");
        assertTrue(leaf1.equals(leaf2));
        assertFalse(leaf1.equals(new LeafNode("leaf2", "value")));
    }

}