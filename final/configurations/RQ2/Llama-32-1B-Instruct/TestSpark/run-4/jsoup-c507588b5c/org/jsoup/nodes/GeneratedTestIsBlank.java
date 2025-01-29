package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("test");
        assertTrue(node.isBlank());
        assertFalse(node.isBlank(null));
    }

}