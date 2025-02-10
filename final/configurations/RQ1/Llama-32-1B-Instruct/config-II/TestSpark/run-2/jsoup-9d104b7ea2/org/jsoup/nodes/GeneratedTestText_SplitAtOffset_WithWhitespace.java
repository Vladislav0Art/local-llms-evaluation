package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestText_SplitAtOffset_WithWhitespace {

    @Test
    public void testText_SplitAtOffset_WithWhitespace() {
        TextNode node = new TextNode("Hello   ,  World!");
        TextNode result = node.splitText(6);
        assertEquals(node, result);
    }

}