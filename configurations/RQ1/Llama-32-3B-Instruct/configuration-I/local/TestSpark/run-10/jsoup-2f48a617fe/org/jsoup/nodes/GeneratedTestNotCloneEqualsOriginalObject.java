package org.jsoup.nodes;

public class GeneratedTestNotCloneEqualsOriginalObject {

    @Test
    public void testNotCloneEqualsOriginalObject() {
        LeafNode original = new LeafNode("original", "value");
        LeafNode cloned = new LeafNode("cloned", "value");
        assertNotEquals(cloned, original);
    }
}

}