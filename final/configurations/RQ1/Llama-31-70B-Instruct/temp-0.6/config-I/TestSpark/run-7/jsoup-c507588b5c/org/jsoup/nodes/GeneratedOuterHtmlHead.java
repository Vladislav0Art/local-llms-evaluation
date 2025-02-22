package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHead {

    @Test
    public void outerHtmlHead() {
        TextNode textNode = new TextNode("Hello world");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, null);
        String expected = "Hello world";
        assertEquals(expected, accum.toString());
    }

}