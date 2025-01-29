package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        Node node = new LeafNode();
        assertTrue(node.isEmpty());
        node.setNode("new_node");
        assertFalse(node.isEmpty());
    }

}