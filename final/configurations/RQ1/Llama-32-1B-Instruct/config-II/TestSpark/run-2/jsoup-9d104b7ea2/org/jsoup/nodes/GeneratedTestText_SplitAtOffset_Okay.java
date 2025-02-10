package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestText_SplitAtOffset_Okay {

    @Test
    public void testText_SplitAtOffset_Okay() {
        TextNode node = new TextNode("Hello  ,   World!");
        TextNode result = node.splitText(4);
        assertEquals(node, result);
    }

}