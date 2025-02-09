package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("text");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        node.outerHtmlTail(sb, 0, settings);
        assertEquals("", sb.toString());
    }

}