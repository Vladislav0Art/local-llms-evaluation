package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode node = new TextNode("test");
        assertEquals("text", node.nodeName());
    }

}