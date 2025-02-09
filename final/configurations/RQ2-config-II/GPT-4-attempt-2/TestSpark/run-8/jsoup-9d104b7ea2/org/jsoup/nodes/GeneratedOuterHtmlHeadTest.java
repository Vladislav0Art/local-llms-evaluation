package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String text = "Test text";
        TextNode textNode = new TextNode(text);
        StringBuilder sb = new StringBuilder();
        textNode.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals(text, sb.toString());
    }

}