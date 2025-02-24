package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("");
        StringBuilder accum = new StringBuilder();
        try {
            textNode.outerHtmlHead(accum, 0, null);
            assertEquals("", accum.toString());
            textNode.text("Hello world!");
            textNode.outerHtmlHead(accum, 1, null);
            assertEquals("Hello world!", accum.toString());
        } catch (IOException e) {
            fail("Should not throw IOException");
        }
    }

}