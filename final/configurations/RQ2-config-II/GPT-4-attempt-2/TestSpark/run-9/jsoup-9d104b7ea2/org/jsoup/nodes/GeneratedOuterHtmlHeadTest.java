package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("outer text");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings settings = new Document.OutputSettings();
        node.outerHtmlHead(sb, 0, settings);
        assertEquals("outer text", sb.toString());
    }

}