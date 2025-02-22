package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("This is a text node");
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        try {
            textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
            assertEquals("This is a text node", accum.toString());
        } catch (IOException e) {
            fail("Failed to test outerHtmlHead");
        }
    }

}