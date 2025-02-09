package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode node = new TextNode("content");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

}