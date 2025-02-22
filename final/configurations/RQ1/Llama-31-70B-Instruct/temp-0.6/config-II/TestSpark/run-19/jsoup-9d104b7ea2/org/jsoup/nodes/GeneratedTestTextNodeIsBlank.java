package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTextNodeIsBlank {

    @Test
    public void testTextNodeIsBlank() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

}