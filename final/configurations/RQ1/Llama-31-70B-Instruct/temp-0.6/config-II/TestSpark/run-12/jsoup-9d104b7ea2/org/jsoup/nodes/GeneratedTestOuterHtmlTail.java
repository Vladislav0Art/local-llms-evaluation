package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        TextNode node = new TextNode("Some text");
        Appendable accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, null);
        assertEquals("", accum.toString());
    }

}