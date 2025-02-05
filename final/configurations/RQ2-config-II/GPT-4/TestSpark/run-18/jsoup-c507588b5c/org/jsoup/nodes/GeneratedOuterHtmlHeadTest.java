package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String sampleText = "sample text";
        TextNode node = new TextNode(sampleText);
        StringBuilder sb = new StringBuilder();
        node.outerHtmlHead(sb, 0, new Document("").outputSettings());
        assertEquals(sampleText, sb.toString());
    }

}