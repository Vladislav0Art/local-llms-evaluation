package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;

public class GeneratedTestTextNodeClone {

    @Test
    public void testTextNodeClone() {
        TextNode node1 = new TextNode("Hello World");
        NodeAssert nodeAssert = new NodeAssert();
        assertEquals(node1, nodeAssert.node1);
    }

}