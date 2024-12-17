package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText_3 {

    @Test
    public void testSplitText_3() {
        TextNode node = new TextNode("<p>Hello <span>World!</span></p>");
        TextNode result = node.splitText(1);
        assertNotNull(result);
        assertEquals(node, result);
    }

}