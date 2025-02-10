package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsBlank_TextOnly {

    @Test
    public void testIsBlank_TextOnly() {
        TextNode node = new TextNode("   ");
        assertEquals(false, node.isBlank());
    }

}