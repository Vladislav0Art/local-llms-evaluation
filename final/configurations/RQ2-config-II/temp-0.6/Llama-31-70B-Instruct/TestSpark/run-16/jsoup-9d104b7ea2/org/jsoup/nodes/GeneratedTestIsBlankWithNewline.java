package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsBlankWithNewline {

    private TextNode textNode;

    @Test
    public void testIsBlankWithNewline() {
        textNode = new TextNode("\n");
        assertTrue(textNode.isBlank());
    }

}