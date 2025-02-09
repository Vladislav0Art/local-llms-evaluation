package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("example text");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, new Document("").outputSettings());

        assertEquals("example text", accum.toString());
    }

}