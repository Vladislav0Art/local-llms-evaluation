package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText_NoOffset {

    @Test
    public void testSplitText_NoOffset() {
        TextNode node = new TextNode("Hello, World!");
        TextNode result = node.splitText(0);
        assertEquals(node, result);
    }

}