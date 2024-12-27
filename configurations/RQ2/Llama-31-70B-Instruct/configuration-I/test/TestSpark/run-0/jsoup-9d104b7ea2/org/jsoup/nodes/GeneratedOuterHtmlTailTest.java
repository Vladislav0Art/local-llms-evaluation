package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            textNode.outerHtmlTail(accum, 0, null);
        } catch (IOException e) {
            fail("Exception thrown");
        }

    }