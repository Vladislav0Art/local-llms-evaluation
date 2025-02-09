package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 1, new Document("http://test.com").outputSettings());
        assertEquals("Test", accum.toString());
    }

}