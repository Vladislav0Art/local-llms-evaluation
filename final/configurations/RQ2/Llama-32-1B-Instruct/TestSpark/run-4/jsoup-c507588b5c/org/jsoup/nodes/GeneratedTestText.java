package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestText {

    @Test
    public void testText() {
        TextNode node = new TextNode("test");
        assertNotNull(node.text());
        assertEquals("test", node.text());
        assertNull(node.text(null));
    }

}