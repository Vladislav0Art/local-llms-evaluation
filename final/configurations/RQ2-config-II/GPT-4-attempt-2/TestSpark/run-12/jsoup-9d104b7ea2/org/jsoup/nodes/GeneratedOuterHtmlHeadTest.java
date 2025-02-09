package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode tn = new TextNode("test text");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlHead(sb, 0, new Document("").outputSettings());
        assertEquals("test text", sb.toString());
    }

}