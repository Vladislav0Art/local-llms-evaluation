package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals("", sb.toString());
    }

}