package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText_OkayOffset {

    @Test
    public void testSplitText_OkayOffset() {
        TextNode node = new TextNode("Hello, World!");
        TextNode result = node.splitText(10);
        assertEquals(node, result);
    }

}