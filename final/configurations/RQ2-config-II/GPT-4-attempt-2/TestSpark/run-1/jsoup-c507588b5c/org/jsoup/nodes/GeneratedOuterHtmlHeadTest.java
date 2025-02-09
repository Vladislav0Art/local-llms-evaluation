package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode("outer text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document("").outputSettings());
        assertEquals("outer text", accum.toString());
    }

}