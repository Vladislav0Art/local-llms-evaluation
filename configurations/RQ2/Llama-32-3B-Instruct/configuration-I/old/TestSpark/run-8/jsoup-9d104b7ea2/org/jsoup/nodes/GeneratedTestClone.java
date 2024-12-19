package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        Node node = new Node("test", 1);
        Node clonedNode = node.clone();
        assertEquals(node, clonedNode);
    }
}

}