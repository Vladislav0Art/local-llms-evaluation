package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("Hello world!");
        StringBuilder accum = new StringBuilder();
        try {
            textNode.outerHtmlHead(accum, 0, new Document.OutputSettings());
            assertEquals("Hello world!", accum.toString());
        } catch (IOException e) {
            fail();
        }
    }

}