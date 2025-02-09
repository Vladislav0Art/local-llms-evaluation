package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Test");
        StringBuilder accum = new StringBuilder();
        node.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("Test", accum.toString());
    }

}