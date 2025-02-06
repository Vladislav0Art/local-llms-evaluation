package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNodeName_EmptyText_ReturnsTextNode {

    @Test
    public void nodeName_EmptyText_ReturnsTextNode() {
        TextNode node = new TextNode("");
        assertEquals("text-node", node.nodeName());
    }

}