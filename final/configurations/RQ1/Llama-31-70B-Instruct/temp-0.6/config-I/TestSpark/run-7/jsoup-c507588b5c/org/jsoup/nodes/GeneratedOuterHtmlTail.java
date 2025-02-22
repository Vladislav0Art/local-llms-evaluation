package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTail {

    @Test
    public void outerHtmlTail() {
        TextNode textNode = new TextNode("Hello world");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, null);
        assertEquals("", accum.toString());
    }

}