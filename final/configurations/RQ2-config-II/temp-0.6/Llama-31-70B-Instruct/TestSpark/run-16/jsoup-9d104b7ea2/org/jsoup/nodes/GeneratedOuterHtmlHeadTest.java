package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode node = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            node.outerHtmlHead(accum, 0, null);
            assertEquals("test", accum.toString());
        } catch (IOException e) {
            fail();
        }
    }

}