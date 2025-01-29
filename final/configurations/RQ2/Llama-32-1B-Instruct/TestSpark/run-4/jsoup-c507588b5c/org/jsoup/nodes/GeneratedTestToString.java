package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        TextNode node = new TextNode("test");
        assertNotNull(node.toString());
        assertEquals("test", node.toString());
        assertNull(node.toString(null));
    }

}