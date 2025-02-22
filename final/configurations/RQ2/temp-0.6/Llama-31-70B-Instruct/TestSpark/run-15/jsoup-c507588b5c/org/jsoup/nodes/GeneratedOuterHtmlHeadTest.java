package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("Text");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());

        assertEquals("Text", accum.toString());
    }

}