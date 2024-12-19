package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        String text = "   ";
        assertTrue(TextNode.isBlank(text));
        text = "";
        assertTrue(TextNode.isBlank(text));
        text = null;
        assertTrue(TextNode.isBlank(text));
    }

}