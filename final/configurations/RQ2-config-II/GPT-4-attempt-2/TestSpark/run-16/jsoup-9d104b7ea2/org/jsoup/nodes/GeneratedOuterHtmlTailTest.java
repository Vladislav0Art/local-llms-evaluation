package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("Some text");
        StringBuilder sb = new StringBuilder();
        node.outerHtmlTail(sb, 0, new Document.OutputSettings());
        assertEquals(sb.toString(), "");
    }

}