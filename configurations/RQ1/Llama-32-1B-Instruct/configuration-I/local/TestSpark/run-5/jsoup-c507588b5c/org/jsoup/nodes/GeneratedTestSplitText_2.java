package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText_2 {

    @Test
    public void testSplitText_2() {
        TextNode node = new TextNode("Hello World!");
        TextNode result = node.splitText(3);
        assertNotNull(result);
        assertEquals(node, result);
    }

}