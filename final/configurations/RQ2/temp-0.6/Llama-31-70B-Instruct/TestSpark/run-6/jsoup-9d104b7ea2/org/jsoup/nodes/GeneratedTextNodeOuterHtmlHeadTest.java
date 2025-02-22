package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeOuterHtmlHeadTest {

    @Test
    public void textNodeOuterHtmlHeadTest() {
        TextNode textNode = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        textNode.outerHtmlHead(accum, 0, null);
        assertEquals("test", accum.toString());
    }

}