package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("test text");
        StringBuilder sb = new StringBuilder();
        node.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("", sb.toString());
    }

}