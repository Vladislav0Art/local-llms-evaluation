package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Some text");
        StringBuilder sb = new StringBuilder();
        node.outerHtmlHead(sb, 0, new Document.OutputSettings());
        assertEquals(sb.toString(), "Some text");
    }

}