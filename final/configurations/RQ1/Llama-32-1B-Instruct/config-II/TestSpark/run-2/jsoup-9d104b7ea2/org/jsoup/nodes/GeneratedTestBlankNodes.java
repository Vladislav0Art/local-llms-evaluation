package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestBlankNodes {

    @Test
    public void testBlankNodes() {
        TextNode node = new TextNode("   ");
        assertTrue(node.isBlank());
    }

}