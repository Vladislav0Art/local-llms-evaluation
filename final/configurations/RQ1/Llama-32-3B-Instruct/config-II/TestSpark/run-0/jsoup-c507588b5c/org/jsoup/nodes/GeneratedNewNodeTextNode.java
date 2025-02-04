package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewNodeTextNode {

    @Test
    public void newNodeTextNode() {
        TextNode node = new TextNode("Hello");
        assertNotNull(node);
        assertEquals("#text", node.nodeName());
        assertEquals("Hello", node.text());
    }

}