package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode node = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        try {
            node.outerHtmlTail(accum, 0, null);
            assertEquals("", accum.toString());
        } catch (IOException e) {
            fail();
        }
    }

}