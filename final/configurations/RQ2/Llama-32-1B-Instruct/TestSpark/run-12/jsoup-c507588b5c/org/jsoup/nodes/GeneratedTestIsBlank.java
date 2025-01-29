package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        assertTrue(new TextNode("").isBlank());
        assertFalse(new TextNode(new String[]{}).isBlank());
        assertFalse(new TextNode(null).isBlank());
    }

}