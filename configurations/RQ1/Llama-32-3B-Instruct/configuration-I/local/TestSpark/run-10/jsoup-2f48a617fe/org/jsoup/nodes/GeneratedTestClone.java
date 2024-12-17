package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        LeafNode original = new LeafNode("original", "value");
        LeafNode cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original, cloned);
        assertNotSame(original, cloned);
    }

}