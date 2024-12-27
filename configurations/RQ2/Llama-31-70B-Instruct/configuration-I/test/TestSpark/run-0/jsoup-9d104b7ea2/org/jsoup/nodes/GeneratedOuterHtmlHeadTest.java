package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            textNode.outerHtmlHead(accum, 0, null);
        } catch (IOException e) {
            fail("Exception thrown");
        }
        assertEquals("test", accum.toString());
    }

}