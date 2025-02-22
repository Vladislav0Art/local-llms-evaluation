package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        TextNode textNode = new TextNode("hello world");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("hello world", accum.toString());
    }

}