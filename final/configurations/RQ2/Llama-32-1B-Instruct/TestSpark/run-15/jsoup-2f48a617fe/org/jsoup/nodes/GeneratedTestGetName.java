package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestGetName {

    @Test
    public void testGetName() {
        Node node = new LeafNode();
        assertEquals("example", node.getName());
        node.setName("new_name");
        assertEquals("new_name", node.getName());
    }

}