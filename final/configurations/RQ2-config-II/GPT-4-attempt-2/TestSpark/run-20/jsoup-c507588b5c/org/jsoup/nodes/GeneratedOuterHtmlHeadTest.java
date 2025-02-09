package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("content");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("content", accum.toString());
    }

}