package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("outer text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlTail(accum, 0, new Document("").outputSettings());
        assertEquals("", accum.toString());
    }

}