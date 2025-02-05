package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode tn = new TextNode("Hello, World!");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals("Hello, World!", sb.toString());
    }

}