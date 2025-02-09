package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("test text");
        StringBuilder sb = new StringBuilder();
        node.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("test text", sb.toString());
    }

}