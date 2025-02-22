package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("text");
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, null);
        assertEquals("text", accum.toString());
    }

}