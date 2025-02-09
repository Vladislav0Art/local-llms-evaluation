package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode tn = new TextNode("Hello");
        StringBuilder accum = new StringBuilder();
        tn.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("Hello", accum.toString());
    }

}