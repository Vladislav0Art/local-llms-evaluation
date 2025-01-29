package org.jsoup.nodes;

import org.junit.Test;

public class GeneratedTestShallowClone {

    @Test
    public void testShallowClone() {
        Node node1 = new Node();
        Node node2 = new Node();
        node1.node = "node1";
        node2.node = node1;
        shallowClone(node2, node1);
        assertEquals("node1", node2.node);
    }

}