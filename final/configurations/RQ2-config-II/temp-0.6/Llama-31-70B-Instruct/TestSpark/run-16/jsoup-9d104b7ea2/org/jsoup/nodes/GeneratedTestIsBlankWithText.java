package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestIsBlankWithText {

    private TextNode textNode;

    @Test
    public void testIsBlankWithText() {
        textNode = new TextNode("test");
        assertFalse(textNode.isBlank());
    }

}