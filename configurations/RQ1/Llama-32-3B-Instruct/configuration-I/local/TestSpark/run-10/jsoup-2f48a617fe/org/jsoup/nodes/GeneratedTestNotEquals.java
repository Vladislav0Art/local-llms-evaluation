package org.jsoup.nodes;

public class GeneratedTestNotEquals {

    @Test
    public void testNotEquals() {
        LeafNode leaf1 = new LeafNode("leaf1", "value");
        LeafNode leaf2 = new LeafNode("leaf2", "value");
        assertTrue(!leaf1.equals(leaf2));
    }
}

}