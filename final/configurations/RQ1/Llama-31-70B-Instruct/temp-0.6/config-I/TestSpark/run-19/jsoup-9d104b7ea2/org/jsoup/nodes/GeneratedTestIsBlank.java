package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        TextNode textNode = new TextNode(" ");
        boolean isBlank = textNode.isBlank();
        assertTrue(isBlank);
    }

}