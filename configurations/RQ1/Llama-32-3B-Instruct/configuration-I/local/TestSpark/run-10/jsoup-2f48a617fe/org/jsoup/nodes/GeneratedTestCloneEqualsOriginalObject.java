package org.jsoup.nodes;

public class GeneratedTestCloneEqualsOriginalObject {

    @Test
    public void testCloneEqualsOriginalObject() {
        LeafNode original = new LeafNode("name", "value");
        LeafNode cloned = original.clone();
        assertEquals(original, cloned);
    }
}

}