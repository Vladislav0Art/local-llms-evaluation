package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode tn = new TextNode("test");
        StringBuilder accum = new StringBuilder();
        tn.outerHtmlHead(accum, 0, new Document("").outputSettings());
        assertEquals("test", accum.toString());
    }

}