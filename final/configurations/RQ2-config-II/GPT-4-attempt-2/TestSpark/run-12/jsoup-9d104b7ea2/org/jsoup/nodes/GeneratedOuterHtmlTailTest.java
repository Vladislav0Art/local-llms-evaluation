package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode tn = new TextNode("test text");
        StringBuilder sb = new StringBuilder();
        tn.outerHtmlTail(sb, 0, new Document("").outputSettings());
        assertEquals("", sb.toString());
    }

}