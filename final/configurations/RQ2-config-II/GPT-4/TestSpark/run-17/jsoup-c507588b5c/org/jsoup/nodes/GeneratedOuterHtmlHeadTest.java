package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws Exception {
        TextNode tn = new TextNode("Some text");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings outputSettings = new Document("").outputSettings();
        tn.outerHtmlHead(sb, 0, outputSettings);
        assertEquals("Some text", sb.toString());
    }

}