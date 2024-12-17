package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSplitText_4 {

    @Test
    public void testSplitText_4() {
        TextNode node = new TextNode("<p>Hello <span>World!</span></p>");
        TextNode result = NodeUtils.splitText(2);
        assertNotNull(result);
        assertEquals(node, result);
    }

}