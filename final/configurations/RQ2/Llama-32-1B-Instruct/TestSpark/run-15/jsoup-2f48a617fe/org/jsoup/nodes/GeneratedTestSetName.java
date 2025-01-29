package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestSetName {

    @Test
    public void testSetName() {
        Node node = new LeafNode();
        String name = "example";
        node.setName(name);
        assertEquals(name, node.getName());
    }

}