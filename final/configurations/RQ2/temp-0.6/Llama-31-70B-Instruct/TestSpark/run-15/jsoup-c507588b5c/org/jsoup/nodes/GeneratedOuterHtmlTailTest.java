package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new Document.OutputSettings());

        assertEquals("", accum.toString());
    }

}