package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsBlank {

    private TextNode textNode;

    @Test
    public void testIsBlank() {
        textNode = new TextNode(" ");
        assertTrue(textNode.isBlank());
    }

}