package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        TextNode node = new TextNode("example text");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlTail(accum, 0, new Document("").outputSettings());

        assertEquals("", accum.toString());
    }

}