package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        TextNode node = new TextNode("Some text");
        Appendable accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, null);
        assertEquals("Some text", accum.toString());
    }

}